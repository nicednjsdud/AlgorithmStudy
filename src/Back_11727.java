import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// dp[n]= dp[n-1]+(2*dp[n-2]
public class Back_11727 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // when
        int dp[] = new int[n + 2];

        dp[1] = 1;
        dp[2] = 3;
        for(int i=3;i<=n;i++){
            dp[i]+=dp[i-1]+(2*dp[i-2]);
            dp[i] %=10007;
        }
        // then
        System.out.println(dp[n]%10007);
        br.close();
    }
}
