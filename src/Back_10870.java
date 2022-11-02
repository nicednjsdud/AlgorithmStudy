import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10870 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // when
        int result = fibonacci(n);

        // then
        System.out.println(result);
        br.close();
    }

    private static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
