import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1978 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        // when
        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {

            int num = Integer.parseInt(token.nextToken());
            for (int j = 2; j <= num; j++) {
                if (num == j) {
                    count++;
                }
                if (num % j == 0) {
                    break;
                }

            }


        }
        // then
        br.close();
        System.out.println(count);
    }
}
