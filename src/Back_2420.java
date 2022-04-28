import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_2420 {
    public static void main(String[] args) throws IOException {

        // when
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        long N = Integer.parseInt(token.nextToken());   // 유명도 N
        long M = Integer.parseInt(token.nextToken());   // 유명도 M

        long result;                                // 두 유명도의 차이

        result = Math.abs(N-M);                     // 절댓값 함수

        System.out.println(result);
    }
}
