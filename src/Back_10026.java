import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10026 {

    static int N;
    static String s;
    static char map[][];
    static boolean visited[][];
    static int dx[] = {-1, 0, 0, 1};
    static int dy[] = {0, 1, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N + 1][N + 1];
        visited = new boolean[N + 1][N + 1];

        for (int i = 0; i < N; i++) {
            s = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        // normal
        int normalCnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j);
                    normalCnt++;
                }
            }
        }


        // dltonism
        int cnt = 0;
        visited = new boolean[N + 1][N + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 'G') {
                    map[i][j] = 'R';
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }
        System.out.println(normalCnt+ " " + cnt);
        br.close();
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        char temp = map[x][y];
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX < 0 || newY < 0 || newX > N || newY > N) {
                continue;
            }
            if (!visited[newX][newY] && map[newX][newY] == temp) {
                dfs(newX, newY);
            }
        }
    }
}
