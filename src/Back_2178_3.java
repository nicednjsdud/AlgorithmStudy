import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_2178_3 {

    // 노드 만들기
    private static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {

        int n, m;
        int maze[][];
        boolean visited[][];
        int dirX[] = {1, 0, -1, 0};
        int dirY[] = {0, 1, 0, -1};
        Queue<Node> nodeQueue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maze = new int[n][m];
        visited = new boolean[n][m];


        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                maze[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }

        // 시작

        // 1. init
        nodeQueue.offer(new Node(0, 0));
        visited[0][0] = true;

        // 2. 이어진곳 끝까지 갈때까지
        while (!nodeQueue.isEmpty()) {

            // 2.1 node 검사
            Node node = nodeQueue.poll();

            for (int i = 0; i < 4; i++) {
                int nowX = node.x + dirX[i];
                int nowY = node.y + dirY[i];

                // 2.2 벽 밖을 넘지않으며, 방문을 하지않았으며, 길인 곳 (1)
                if (nowX >= 0 && nowX < m
                        && nowY >= 0 && nowY < n
                        && !visited[nowY][nowX] && maze[nowY][nowX] == 1) {
                    // 2.3 방문체크
                    visited[nowY][nowX] = true;
                    // 2.4 새로운 길추가
                    nodeQueue.offer(new Node(nowX, nowY));
                    // 2.5 길에 1추가
                    maze[nowY][nowX] = maze[node.y][node.x] + 1;
                }
            }
        }

        System.out.println(maze[n - 1][m - 1]);
        br.close();


    }
}
