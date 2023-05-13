import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1075 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long F = Long.parseLong(br.readLine());

        long temp = (N / 100) * 100;

        while (true) {
            if (temp % F == 0) {
                long result = temp % 100;
                if (result < 10) System.out.println("0" + result);
                else System.out.println(result);
                return;
            }
            temp++;
        }
    }
}
