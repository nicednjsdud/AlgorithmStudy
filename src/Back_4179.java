import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Back_4179 {

    static int dX[] = {0, 0, 1, -1};
    static int dY[] = {1, -1, 0, 0};

    static int R, C;

    static class Point {
        int x;
        int y;
        int time;

        Point(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        char[][] map = new char[R][C];

        Point[] points = new Point[2];
        Queue<Point> fires = new LinkedList<>();
        Queue<Point> jihos = new LinkedList<>();

        for (int i = 0; i < R; i++) {
            String temp = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = temp.charAt(j);
                if (map[i][j] == 'F') {
                    Point fire = new Point(i, j, 0);
                    fires.offer(fire);
                } else if (map[i][j] == 'J') {
                    Point jiho = new Point(i, j, 0);
                    jihos.offer(jiho);
                }
            }
        }

        int result = bfs(map, jihos, fires);
        System.out.println(result == -1 ? "IMPOSSIBLE" : result);
    }

    private static int bfs(char[][] map, Queue<Point> jihos, Queue<Point> fires) {
        int[][] visited = new int[R][C];

        while (!jihos.isEmpty()) {
            int fireSize = fires.size();
            for (int f = 0; f < fireSize; f++) {
                Point fire = fires.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = fire.x + dX[i];
                    int ny = fire.y + dY[i];

                    if (nx < 0 || ny < 0 || nx >= R || ny >= C) {
                        continue;
                    }

                    if (map[nx][ny] == '.' || map[nx][ny] == 'J') {
                        map[nx][ny] = 'F';
                        fires.offer(new Point(nx, ny, fire.time + 1));
                    }
                }
            }

            int jihoSize = jihos.size();
            for (int j = 0; j < jihoSize; j++) {
                Point jiho = jihos.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = jiho.x + dX[i];
                    int ny = jiho.y + dY[i];

                    if (nx < 0 || ny < 0 || nx >= R || ny >= C) {
                        return jiho.time + 1;
                    }

                    if (map[nx][ny] == '.' && visited[nx][ny] == 0) {
                        visited[nx][ny] = 1;
                        jihos.offer(new Point(nx, ny, jiho.time + 1));
                    }
                }
            }
        }
        return -1;
    }
}
