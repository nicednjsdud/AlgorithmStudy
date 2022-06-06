import java.util.Scanner;

public class Back_10844 {

    static Long[][] dp;
    final static long MOD = 1000000000L;
    public static void main(String[] args) {

        // given
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        dp = new Long[N+1][10];


        // 첫번째 자릿수는 1로 초기화
        for(int i=0;i<10;i++){
            dp[1][i] = 1L;
        }
        long result = 0;

        // 마지막 자릿수인 1~9까지의 경우의 수를 모두 더해준다.
        for(int i=1;i<=9;i++){
            result +=recur(N,i);
        }
        System.out.println(result%MOD);
    }
    static long recur(int N,int i){
        
        // 첫째 자리수에 도착한다면 더이상 탐색할 필요 없음
        if(N==1){
            return dp[N][i];
        }
        
        // 해당 자리수의 val값에 대해 탐색하지 않았을 경우 
        if(dp[N][i]==null){
            // val이 0일경우 다음은 1밖에 못옴
            if(i==0){
                dp[N][i]=recur(N-1,1);
            }
            // val이 1일경우 다음은 8밖에 못옴
            else if(i==9){
                dp[N][i]=recur(N-1,8);
            }
            // 그 외의 경우는 val-1과 va1+1값의 경우의 수를 합한 경우의 수가 됨
            else{
                dp[N][i]=recur(N-1,i-1)+recur(N-1,i+1);
            }
        }
        return dp[N][i] % MOD;
    }

}
