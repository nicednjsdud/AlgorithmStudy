import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_6593 {

    public static class Node {
        int l;
        int r;
        int c;

        int count;

        public Node(int l, int r, int c, int count) {
            this.l = l;
            this.r = r;
            this.c = c;
            this.count = count;
        }
    }

    static int L, R, C;
    static int[] dl = {0, 0, 0, 0, 1, -1}; //순서대로 오 왼 위 아래 위층 아래층
    static int[] dr = {0, 0, -1, 1, 0, 0};
    static int[] dc = {1, -1, 0, 0, 0, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());

            L = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            if (L == 0 && R == 0 && C == 0) {
                break;
            }
            char[][][] building = new char[L][R][C];
            Node[] nodes = new Node[2]; // 시작점과 도착점 저장
            for (int i = 0; i < L; i++) {
                for (int j = 0; j < R; j++) {
                    String temp = br.readLine();
                    for (int k = 0; k < C; k++) {
                        char c = temp.charAt(k);
                        building[i][j][k] = c;
                        if (c == 'S') { //시작 지점 입력
                            nodes[0] = new Node(i, j, k, 0);
                        } else if (c == 'E') { //도착 지점 입력
                            nodes[1] = new Node(i, j, k, 0);
                        }
                    }
                }
                String blank = br.readLine();
            }

            int result = bfs(nodes, building);
            if (result == -1) {
                System.out.println("Trapped!");
            } else {
                System.out.println("Escaped in " + result + " minute(s).");
            }
        }
        br.close();
    }

    private static int bfs(Node[] nodes, char[][][] building) {
        Queue<Node> q = new LinkedList<>();
        q.offer(nodes[0]);

        boolean visited[][][] = new boolean[L][R][C];
        visited[nodes[0].l][nodes[0].r][nodes[0].c] = true; // 시작 위치 방문 처리

        while (!q.isEmpty()) {
            Node node = q.poll();
            // 목표 지점에 도달하면 이동 횟수 반환
            if (node.l == nodes[1].l && node.r == nodes[1].r && node.c == nodes[1].c) {
                return node.count;
            }

            for(int i = 0; i< 6; i++){
                int curL = node.l + dl[i];
                int curR = node.r + dr[i];
                int curC = node.c + dc[i];

                if(curL >= 0 && curL < L
                        && curR >= 0 && curR < R
                        && curC >= 0 && curC < C
                ){
                    if(!visited[curL][curR][curC] && building[curL][curR][curC] != '#') {
                        visited[curL][curR][curC] = true;
                        q.offer(new Node(curL, curR, curC, node.count + 1));
                    }
                }
            }
        }
        return -1;
    }
}
