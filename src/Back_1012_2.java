import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_1012_2 {

    private static class Pair {
        int x;
        int y;

        private Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    static int[] dirX = {1, 0, -1, 0};
    static int[] dirY = {0, 1, 0, -1};

    static int[][] ground;
    static boolean[][] visited;

    static int M, N, K;

    static int count = 0;

    static Queue<Pair> qu = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            ground = new int[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    ground[i][j] = 0;
                }
            }

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                ground[y][x] = 1;
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (ground[i][j] == 1 && !visited[i][j]) {
                        visited[i][j] = true;
                        bfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
            count = 0;
        }

    }

    private static void bfs(int y, int x) {
        qu.offer(new Pair(x, y));

        while (!qu.isEmpty()) {
            Pair pair = qu.poll();
            int curX = pair.x;
            int curY = pair.y;

            for (int i = 0; i < 4; i++) {
                int nX = curX + dirX[i];
                int nY = curY + dirY[i];

                if (nX >= 0 && nX < M && nY >= 0 && nY < N
                        && ground[nY][nX] == 1 && !visited[nY][nX]) {
                    visited[nY][nX] = true;
                    qu.offer(new Pair(nX, nY));
                }
            }
        }
    }
}














