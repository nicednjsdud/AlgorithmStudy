import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2581 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        // N 배열 생성
        boolean prime[] = new boolean[N + 1];

        // 0하고 1은 소수가 아님
        prime[0] = true;
        prime[1] = true;

        // 에라토스테네스 체
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
        int sum = 0;
        int small_count = 0;
        // when
        for (int i = M; i <= N; i++) {

            // i 가 소수이면
            if (prime[i] == false) {
                sum += i;

                // 첫 소수는 최소값
                if (small_count == 0) {
                    small_count = i;
                }
            }
        }

        // then
        if (sum == 0 && small_count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(small_count);
        }

        br.close();
    }
}
