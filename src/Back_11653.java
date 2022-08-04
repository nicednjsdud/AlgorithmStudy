import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_11653 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        // when
        for(int i=2;i<=N;i++){      // N 까지 숫자 넣기
            while(true) {
                if (N % i == 0) {
                    N /= i;
                    sb.append(i).append("\n");
                }
                else{
                    break;
                }
            }
        }
        // then
        System.out.println(sb);
    }
}
