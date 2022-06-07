import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_2156 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    // 포도주 잔의 개수
        int dp[] = new int[n];
        int glass[] = new int[n];                     // 포도주 잔
        // when
        for (int i = 0; i < n; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            glass[i] = Integer.parseInt(token.nextToken());  // 입력
        }


        if (n == 1) {
            System.out.println(glass[0]);
        } else if (n == 2) {
            System.out.println(glass[0] + glass[1]);
        } else {
            dp[0] = glass[0];
            dp[1] = dp[0] + glass[1];
            dp[2] = Math.max(dp[1], Math.max(glass[0] + glass[2], glass[1] + glass[2]));

            for (int j = 3; j < n; j++) {
                dp[j] = Math.max(dp[j - 3] + glass[j] + glass[j - 1], dp[j - 2] + glass[j]);
                dp[j] = Math.max(dp[j - 1], dp[j]);
            }
            System.out.println(dp[n - 1]);

        }

        // then

        br.close();
    }
}
