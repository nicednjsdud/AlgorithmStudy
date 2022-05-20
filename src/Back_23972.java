import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// (가진돈-지불할돈)* 배수 = 가진돈
public class Back_23972 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        long K = Long.parseLong(token.nextToken());        // 제안한 K
        long N = Long.parseLong(token.nextToken());        // 제안한 N
        long x=(K/2)*N;
        // when
        long result =0;
        if(N!=1L){
            result=(K*N)/(N-1L);

            if((K*N)%(N-1L)!=0L){
                result += 1L;
            }
        }
        else{
            result= -1L;
        }
        System.out.println(result);
        br.close();
    }
}
