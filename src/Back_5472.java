import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_5472 {

    static class Point {
        int x, y, time;
        Point(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

    static int[] dX = {0, 0, 1, -1}; // 이동 방향 (좌우)
    static int[] dY = {1, -1, 0, 0}; // 이동 방향 (상하)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            char[][] map = new char[h][w];

            Queue<Point> fires = new LinkedList<>();
            Queue<Point> sang = new LinkedList<>();

            for (int j = 0; j < h; j++) {
                String temp = br.readLine();
                for (int k = 0; k < w; k++) {
                    map[j][k] = temp.charAt(k);

                    if (map[j][k] == '*') {
                        fires.offer(new Point(j, k, 0));
                    } else if (map[j][k] == '@') {
                        sang.offer(new Point(j, k, 0));
                    }
                }
            }
            int result = bfs(w, h, map, sang, fires);
            System.out.println(result == -1 ? "IMPOSSIBLE" : result);
        }
    }

    private static int bfs(int width, int height, char[][] map, Queue<Point> sangQ, Queue<Point> fires) {
        int[][] visited = new int[height][width];

        while (!sangQ.isEmpty()) {

            // 🔥 불 확산
            int fireSize = fires.size();
            for (int f = 0; f < fireSize; f++) {
                Point fire = fires.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = fire.x + dX[i];
                    int ny = fire.y + dY[i];

                    // ✅ 좌표 검증 (height와 width 올바르게 적용)
                    if (nx < 0 || ny < 0 || nx >= height || ny >= width) {
                        continue;
                    }

                    if (map[nx][ny] == '.' || map[nx][ny] == '@') {
                        map[nx][ny] = '*';
                        fires.offer(new Point(nx, ny, fire.time + 1));
                    }
                }
            }

            // 🏃‍♂️ 상근 이동
            int sangSize = sangQ.size();
            for (int s = 0; s < sangSize; s++) {
                Point sang = sangQ.poll();

                for (int i = 0; i < 4; i++) {
                    int nextRow = sang.x + dX[i];
                    int nextCol = sang.y + dY[i];

                    // ✅ 상근이 가장자리에 도달하면 탈출 성공
                    if (nextRow < 0 || nextCol < 0 || nextRow >= height || nextCol >= width) {
                        return sang.time + 1;
                    }

                    // ✅ 올바른 이동 가능 여부 체크
                    if (map[nextRow][nextCol] == '.' && visited[nextRow][nextCol] == 0) {
                        visited[nextRow][nextCol] = 1;
                        sangQ.offer(new Point(nextRow, nextCol, sang.time + 1));
                    }
                }
            }
        }
        return -1; // 탈출 불가능한 경우
    }
}
