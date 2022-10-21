import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_4948 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // when
        while (true) {
            int test_num = Integer.parseInt(br.readLine());
            int count = 0;
            if (test_num == 0) {
                break;
            }
            boolean prime[] = new boolean[(test_num * 2) + 1];
            // 0하고 1은 소수가 아님
            prime[0] = true;
            prime[1] = true;

            // 에라토스테네스 체
            for (int i = 2; i < Math.sqrt(prime.length); i++) {
                for (int j = i * i; j < prime.length; j += i) {
                    prime[j] = true;
                }
            }
            // test_num 보다 크고 (test_num +1) 2(test_num) 보다 작거나 같은 (<=)
            for (int i = test_num+1; i <= test_num * 2; i++) {

                // i 가 소수이면
                if (prime[i] == false) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        // then
        br.close();
        System.out.println(sb);
    }
}
