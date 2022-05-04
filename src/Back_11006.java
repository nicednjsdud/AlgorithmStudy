import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_11006 {
    public static void main(String[] args) throws IOException {
        
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.parseInt(br.readLine());     // 테스트 갯수입력
        // when
        for(int i=0;i<T;i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int N =Integer.parseInt(token.nextToken());   // 모든 닭의 다리수합
            int M =Integer.parseInt(token.nextToken());   // 닭의수
            int leg_sum = M*2;                            // 닭은 다리가 2개
            int U = leg_sum - N;                        // 잘린 다리수 찾기 and 닭의수
            int good =M-U;                               // 멀쩡한 닭

            System.out.print(U+" "+good);
            System.out.println();
        }
        
        
        // then
    }
}
