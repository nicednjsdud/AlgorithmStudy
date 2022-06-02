import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 점화식 dp[n]= dp[n-3]+dp[n-2]+dp[n-1}
public class Back_9095 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int dp[]= new int [11];
        int out[]= new int[T];
        dp[1]= 1;
        dp[2]= 2;
        dp[3]= 4;
        // when
        for(int i=4;i<=10;i++){
            dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
        }

        // then
        for(int i=0;i<T;i++){
            int num = Integer.parseInt(br.readLine());
            out[i]=dp[num];
            System.out.println(out[i]);
        }
        br.close();
    }
}
