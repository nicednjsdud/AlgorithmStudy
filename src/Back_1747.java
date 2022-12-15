import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1747 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean is_ok = true;
        // when
        while (true) {
            if(N == 1){
                System.out.println(2);
                break;
            }
            String temp_N = N + "";
                for (int i = 0; i <= temp_N.length() / 2; i++) {
                    if (temp_N.charAt(i) == temp_N.charAt(temp_N.length() - i -1))
                        is_ok = false;
                    else {
                        is_ok = true;
                        break;
                    }
                }
            if (!is_ok) {
                for (int i = 2; i <= (int) Math.sqrt(N); i++) {
                    if (N % i == 0) {
                        is_ok = true;
                        break;
                    }
                }
            }
            if (!is_ok) {
                // then
                System.out.println(N);
                System.exit(0);
            }
            N++;
        }
    }
}
