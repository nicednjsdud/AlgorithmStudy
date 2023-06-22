import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_2178_2 {

    static boolean visited[][];
    static int maze[][];
    static int dirY[] = {-1, 1, 0, 0};
    static int dirX[] = {0, 0, -1, 1};
    static Queue<Node> que = new LinkedList<>();

    static int nowX, nowY;
    static int x, y;
    static int N, M;

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N][M];
        maze = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                maze[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }

        BFS(0, 0);
        System.out.println(maze[N - 1][M - 1]);

    }

    private static void BFS(int x, int y) {
        que.offer(new Node(x, y));
        visited[y][x] = true;

        while (!que.isEmpty()) {
            Node node = que.poll();

            for (int i = 0; i < 4; i++) {
                nowY = node.y + dirY[i];
                nowX = node.x + dirX[i];

                if (nowX >= 0 && nowX < M && nowY >= 0 && nowY < N && visited[nowY][nowX] == false && maze[nowY][nowX] == 1) {
                    que.offer(new Node(nowX, nowY));
                    visited[nowY][nowX] = true;

                    maze[nowY][nowX] = maze[node.y][node.x] + 1;
                    if (visited[N - 1][M - 1] == true) {
                        return;
                    }
                }
            }
        }
    }
}
