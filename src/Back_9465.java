import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 특정 n번 째 dp값을 채우기 위해선, 한 칸 또는 두 칸 뒤의 대각선을 고려해주면 된다.
// 점화식은 dp[0][j]=Math.max(dp[1][j-1],dp[1][j-2])+sticker[0][j];
//        dp[1][j]=Math.max(dp[0][j-1],dp[0][j-2])+sticker[1][j];
public class Back_9465 {
    public static void main(String[] args) throws IOException {


        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());        // 테스트 케이스

        // when
        for(int i=0;i<T;i++){
            int n = Integer.parseInt(br.readLine());

            // 입력되는 n 값 배열 생성
            int sticker[][] = new int[2][n+1];
            int dp[][]=new int[2][n+1];
            
            // 스티커 점수 입력
            for(int j=0;j<2;j++){
                StringTokenizer token = new StringTokenizer(br.readLine());
                for(int k=1;k<=n;k++){
                    sticker[j][k]=Integer.parseInt(token.nextToken());
                }
            }
            // 0번째와 1번째 행의 첫번째 열이 초기화로 초기값이 됨
            dp[0][1]= sticker[0][1];
            dp[1][1]= sticker[1][1];
            
            // 행 0번 1번 동시처리
            for(int j=2;j<=n;j++){
                dp[0][j]=Math.max(dp[1][j-1],dp[1][j-2])+sticker[0][j];
                dp[1][j]=Math.max(dp[0][j-1],dp[0][j-2])+sticker[1][j];
            }
            // then
            // 두 열중 최댓값을 반환후 출력
            System.out.println(Math.max(dp[0][n],dp[1][n]));
        }
        br.close();
    }

}
