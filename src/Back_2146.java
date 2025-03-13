import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_2146 {

    static class Point {
        int x, y, count, island;

        public Point(int x, int y, int count, int island) {
            this.x = x;
            this.y = y;
            this.count = count;
            this.island = island;
        }
    }

    static int[] dX = {0, 0, 1, -1};
    static int[] dY = {1, -1, 0, 0};

    static int[][] map;
    static boolean[][] visited;
    static int N, min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        // 1. 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 2. 섬 번호 매기기
        int islandNumber = 2;
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    markIsland(i, j, islandNumber);
                    islandNumber++;
                }
            }
        }

        // 3. 최단 다리 길이 찾기
        min = Integer.MAX_VALUE;
        findShortestBridge();

        // 4. 결과 출력
        System.out.println(min);
    }

    // BFS로 섬에 고유 번호를 부여
    private static void markIsland(int x, int y, int islandNumber) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y, 0, islandNumber));
        visited[x][y] = true;
        map[x][y] = islandNumber;

        while (!q.isEmpty()) {
            Point now = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dX[i];
                int ny = now.y + dY[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        map[nx][ny] = islandNumber;
                        q.offer(new Point(nx, ny, 0, islandNumber));
                    }
                }
            }
        }
    }

    // 최단 다리 찾기 (BFS)
    private static void findShortestBridge() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] > 1) {
                    boolean[][] visited = new boolean[N][N];
                    bfs(i, j, map[i][j], visited);
                }
            }
        }
    }

    // BFS로 다른 섬까지의 최단 거리 찾기
    private static void bfs(int x, int y, int islandNumber, boolean[][] visited) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y, 0, islandNumber));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Point now = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dX[i];
                int ny = now.y + dY[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny]) {
                    if (map[nx][ny] == 0) {
                        visited[nx][ny] = true;
                        q.offer(new Point(nx, ny, now.count + 1, islandNumber));
                    } else if (map[nx][ny] != islandNumber) {
                        min = Math.min(min, now.count);
                        return;
                    }
                }
            }
        }
    }
}
