import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1676 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        // when
        while (N >= 5) {
            count += N / 5;
            N /= 5;
        }
        // then
        br.close();
        System.out.println(count);
    }
}
