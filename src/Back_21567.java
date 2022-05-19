import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_21567 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long A = Integer.parseInt(br.readLine());    // A 입력
        long B = Integer.parseInt(br.readLine());    // B 입력
        long C = Integer.parseInt(br.readLine());    // C 입력
        long count[]= new long[10];                  // 배열 생성
        // when
        String sum = (A*B*C)+"";                    // 문자열로 변환

        for(int i=0;i<sum.length();i++){
            int ch = sum.charAt(i);
            count[ch-48]++;                         // char형을 인트배열에 담기
        }
        // then
        for(int i=0;i<count.length;i++) {
            System.out.println(count[i]);
        }
        br.close();
    }
}
