import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_2293 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coin = new int[n];
        int[] dp = new int[k + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for(int j = 1; j <=k ; j++){
                if( j >= coin[i]){
                    dp[j] += dp[j - coin[i]];
                }
            }
        }
        br.close();
        System.out.println(dp[k]);
    }
}
