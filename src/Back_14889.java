import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class Back_14889 {

    static int N;
    static int[][] arr;
    static boolean[] teamCheck;

    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        teamCheck = new boolean[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);
        System.out.println(min);
        br.close();
    }

    private static void dfs(int idx, int depth) {

        if (depth == N / 2) {

            int teamStartCount = 0;
            int teamLinkCount = 0;

            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (teamCheck[i] == true && teamCheck[j] == true) {
                        teamStartCount += arr[i][j];
                        teamStartCount += arr[j][i];
                    } else if (teamCheck[i] == false && teamCheck[j] == false) {
                        teamLinkCount += arr[i][j];
                        teamLinkCount += arr[j][i];
                    }
                }
            }
            int val = Math.abs(teamStartCount - teamLinkCount);

            if (val == 0) {
                System.out.println(val);
                System.exit(0);
            } else {
                min = Math.min(val, min);
            }

            return;
        }

        for (int i = idx; i < N; i++) {

            if (!teamCheck[i]) {
                teamCheck[i] = true;
                dfs(i + 1, depth + 1);
                teamCheck[i] = false;
            }
        }
    }
}
