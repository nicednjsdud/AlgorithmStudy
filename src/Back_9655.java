import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_9655 {
    public static void main(String[] args) throws IOException {

        // n = 1 이면 상근 1                    상근 승
        // n = 2 이면 상근 1 창영 1              창영 승
        // n = 3 이면 상근 3                    상근 승
        // n = 4 이면 상근 1 or3 창영 1 or 3     창영 승

        // 점화식 dp[n] = Math.min(dp[n-1], dp[n-3]) + 1
        // 홀수이면 상근 승 짝수이면 창영 승
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;
        for (int i = 4; i <= N; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 3]) - 1;
        }
        if(dp[N] % 2 == 0){
            System.out.println("CY");
        }
        else{
            System.out.println("SK");
        }
    }
}
