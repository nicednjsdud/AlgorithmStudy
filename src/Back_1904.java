import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1904 {

    static int[] dp = new int[1000001];
    public static void main(String[] args) throws IOException {

        // dp

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        // -1로 초기화
        for(int i = 3; i <= N; i++){
            dp[i] = -1;
        }

        System.out.println(tile(N));
        br.close();
    }

    private static Integer tile(int n) {

        if(dp[n] == -1){
            dp[n] = (tile(n-2) + tile(n-1)) % 15746;
        }
        return dp[n];
    }
}
