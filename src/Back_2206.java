import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_2206 {

    static class Point {
        int x;
        int y;
        int count;
        boolean destroyed;

        public Point(int x, int y, int count, boolean destroyed) {
            this.x = x;
            this.y = y;
            this.count = count;
            this.destroyed = destroyed;
        }
    }

    static int[] dX = {0, 0, 1, -1};
    static int[] dY = {1, -1, 0, 0};

    static int N, M;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        char[][] map = new char[N][M];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = temp.charAt(j);
            }
        }
        System.out.println(bfs(map));
    }

    private static int bfs(char[][] map) {
        Queue<Point> points = new LinkedList<>();
        points.offer(new Point(0, 0, 1, false));
        boolean[][][] visited = new boolean[N][M][2];

        visited[0][0][0] = true;
        while (!points.isEmpty()) {
            Point now = points.poll();

            if (now.x == N - 1 && now.y == M - 1) {
                return now.count;
            }

            for (int i = 0; i < 4; i++) {
                int dirX = now.x + dX[i];
                int dirY = now.y + dY[i];

                if (dirX >= N || dirX < 0 || dirY >= M || dirY < 0) continue;

                if (map[dirX][dirY] == '0') {
                    if (!now.destroyed && !visited[dirX][dirY][0]) {
                        points.offer(new Point(dirX, dirY, now.count + 1, false));
                        visited[dirX][dirY][0] = true;
                    } else if (now.destroyed && !visited[dirX][dirY][1]) {
                        points.offer(new Point(dirX, dirY, now.count + 1, true));
                        visited[dirX][dirY][1] = true;
                    }
                } else if (map[dirX][dirY] == '1') {
                    if (!now.destroyed) {
                        points.offer(new Point(dirX, dirY, now.count + 1, true));
                        visited[dirX][dirY][1] = true;
                    }
                }
            }
        }


        return -1;
    }
}
