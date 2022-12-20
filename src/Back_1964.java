import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1964 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long result = 5;
        long dot = 7;
        if (N == 1) {
            System.out.println(result % 45678);
        } else {
            // 1 개 5
            // 2 개 5 + ( 5 + 2 )    2번째까지는 2개씩 늘어나지만 3번째부터는 3개씩 늘어남
            // 3 개 5 + ( 5 + 2 ) + ( 7 + 3 )
            // 4 개 5 + ( 5 + 2 ) + ( 7 + 3 ) + ( 10 + 3 )
            for (int i = 2; i <= N; i++) {
                result += dot;
                dot += 3;
            }
            System.out.println(result % 45678);
        }
        br.close();
    }
}
