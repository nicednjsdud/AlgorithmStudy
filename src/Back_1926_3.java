import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_1926_3 {

    private static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public static void main(String[] args) throws IOException {

        int[] dirX = {1, 0, -1, 0};
        int[] dirY = {0, 1, 0, -1};
        int n, m;
        int maxWidth = 0;
        int count = 0;
        int[][] painting;
        boolean[][] visited;
        Queue<Node> nodeQueue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        painting = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            // 띄어쓰기;; 주의
            String str = br.readLine().replace(" ","");
            for (int j = 0; j < m; j++) {
                painting[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 1. 방문하지 않았고, 그림이면
                if (!visited[i][j] && painting[i][j] == 1) {
                    // 2. 시작 init
                    nodeQueue.offer(new Node(j, i));
                    visited[i][j] = true;
                    count ++;
                    int width = 1;
                    while (!nodeQueue.isEmpty()) {
                        Node node = nodeQueue.poll();

                        for (int k = 0; k < 4; k++) {
                            int nowX = node.x + dirX[k];
                            int nowY = node.y + dirY[k];
                            // 방문하지 않았고 범위를 넘지않고 그림이면
                            if(nowX >=0 && nowX < m && nowY >=0 && nowY < n
                                && !visited[nowY][nowX] && painting[nowY][nowX] == 1
                            ){
                                visited[nowY][nowX] = true;
                                nodeQueue.offer(new Node(nowX,nowY));
                                width ++;
                            }
                        }
                    }
                    maxWidth = Math.max(maxWidth, width);
                }
            }
        }
        System.out.println(count);
        System.out.println(maxWidth);
        br.close();

    }
}
