import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_11320 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());    // 테스트 갯수

        // when
        for(int i=0;i<T;i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(token.nextToken());    // A의 변의길이
            int B = Integer.parseInt(token.nextToken());    // B의 변의길이
            int count =0;                                   // 갯수

            // then
            if (A % B == 0) {

                count = (A / B) * (A / B);
                System.out.println(count);                    // 두삼각형이 똑같으면
            } else {
                count = (A / B + 1) * (A / B + 1);
                System.out.println(count);
            }
        }
        br.close();



    }
}
