import java.util.Scanner;

public class Back_2193 {
    public static void main(String[] args) {

        // given
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long dp[]=new long [n+1];
        // dp[n] = n자리 이친수
        dp[0]=0;
        dp[1]=1;
        // when
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        // then
        System.out.println(dp[n]);
    }
}
