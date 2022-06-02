import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_11726 {

    // dp[n] = dp[n-2] + dp[n-1]
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // given
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[N+2];
        dp[1] = 1;
        dp[2] = 2;
        // when
        for (int i = 3; i <= N; i++) {
            dp[i] += dp[i - 2] + dp[i - 1];
            dp[i] %= 10007; // 나머지 계산해주면서 반복
        }
        // then
        System.out.println(dp[N]%10007);
        br.close();
    }
}
