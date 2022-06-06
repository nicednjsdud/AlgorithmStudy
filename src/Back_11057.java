import java.util.Scanner;

public class Back_11057 {

    static int dp[][];

    public static void main(String[] args) {


        // given
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // when
        dp = new int[N+1][10];
        for(int i=0;i<10;i++){
            dp[1][i] = 1;
        }
        for(int i=1;i<N+1;i++){
            for(int j=0; j<10;j++){
                for(int k=j;k<10;k++){
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
                }
            }
        }
        // then
        System.out.println(dp[N][0] %10007);
    }
}
