import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_11055 {
    static int N;
    static int dp[], seq[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        seq = new int[N+1];
        dp = new int[N+1];
        int max=0;
        StringTokenizer token = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            seq[i] = Integer.parseInt(token.nextToken());   // 값입력
            dp[i] = seq[i];
        }

        // 값이 하나 주어질때를 대비
        int result = dp[1];

        for(int i=1;i<=N;i++){
            for(int j=0;j<i;j++){
                if(seq[j]<seq[i]){
                    dp[i] = Math.max(dp[j]+seq[i],dp[i]);
                    result=Math.max(result,dp[i]);
                }
            }
        }
        System.out.println(result);
        br.close();


    }


}
