import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1912 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        int dp[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = arr[0];
        int sum = arr[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);       // 재귀

            sum = Math.max(sum, dp[i]);
        }
        System.out.println(sum);
    }
}
