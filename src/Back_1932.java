import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1932 {

    static int arr[][];
    static Integer[][] dp;
    static int n;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        dp = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                if (i == n -1) {
                    // dp 맨밑줄 초기화
                    dp[i][j] = arr[i][j];
                }
            }
        }
        System.out.println(find(0,0));
        br.close();
    }

    private static int find(int depth, int idx) {
        if(depth == n -1) return dp[depth][idx];

        if(dp[depth][idx] == null){
            dp[depth][idx] = Math.max(find(depth+1, idx), find(depth+1,idx+1)) + arr[depth][idx];
        }
        return dp[depth][idx];
    }
}
