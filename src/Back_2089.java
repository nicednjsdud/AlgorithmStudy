import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2089 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        // when
        if (n == 0) {
            System.out.println(0);
        } else {
            while (n != 1) {
                sb.append(Math.abs(n % -2));
                n = (int) Math.ceil((double) n / (-2));
            }
            sb.append(n);
        }

        // then
        br.close();
        System.out.println(sb.reverse());
    }
}
