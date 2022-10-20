import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2581 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int small_count = 0;
        // when
        for (int i = M; i <= N; i++) {

            int count = 0;
            for (int j = 3; j < i; j++) {

                if (i % j != 0) {
                   continue;
                } else {
                    count++;
                    break;
                }

            }
            // 소수라면
            if (count == 0) {
                if (small_count == 0) {
                    small_count = i;
                    sum += small_count;
                } else {
                    // 최소값 구하기
                    sum += i;
                    small_count = Math.min(i, small_count);
                }
            }
        }
        // then
        if(sum == 0 && small_count == 0){
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(small_count);
        }
        br.close();
    }
}
