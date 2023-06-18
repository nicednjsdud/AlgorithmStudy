import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_1926 {

    public static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    static int n;
    static int m;
    static int arr[][];
    static boolean[][] visited;
    static int[] dx;
    static int[] dy;
    static Queue<Pair> qu;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];
        qu = new LinkedList<>();

        dx = new int[]{1, 0, -1, 0};
        dy = new int[]{0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int area = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 0 이거나 방문한적이 있으면 continue
                if (arr[i][j] == 0 || visited[i][j]) {
                    continue;
                }
                count++;       // 1이고, 방문하지 않았으므로 시작점
                qu.offer(new Pair(i, j));
                visited[i][j] = true;
                area = 0;
                while (!qu.isEmpty()) {
                    Pair p = qu.poll();
                    area++;
                    for (int k = 0; k < 4; k++) {
                        int nX = p.x + dx[k];
                        int nY = p.y + dy[k];
                        if (nX < 0 || nX >= n || nY < 0 || nY >= m) {
                            continue;
                        }
                        if(arr[nX][nY] == 1 && !visited[nX][nY]){
                            qu.offer(new Pair(nX,nY));
                            visited[nX][nY] = true;
                        }
                    }
                }
                if(area > max){
                    max = area;
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
    }
}
