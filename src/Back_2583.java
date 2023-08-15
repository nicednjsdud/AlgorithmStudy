import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Back_2583 {

    static int dx[] = {-1, 0, 0, 1};
    static int dy[] = {0, 1, -1, 0};
    static int M, N, K;
    static int map[][];

    static int count;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[M][N];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    map[y][x] = 1;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0) {
                    count = 0;
                    dfs(i, j);
                    list.add(count);
                }

            }
        }
        Collections.sort(list);
        sb.append(list.size()).append("\n");
        for (Integer integer : list) {
            sb.append(integer + " ");
        }
        System.out.println(sb);
    }

    private static void dfs(int x, int y) {
        map[x][y] = 1;
        count++;

        for (int k = 0; k < 4; k++) {
            int newX = x + dx[k];
            int newY = y + dy[k];

            if (newX >= 0 && newX < M && newY >= 0 && newY < N) {
                if (map[newX][newY] == 0) {
                    dfs(newX, newY);
                }
            }
        }
    }
}
