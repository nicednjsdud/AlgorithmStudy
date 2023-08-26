import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 1;
        for (int i = 0; i < N; i++) {
            sum --;
            sum += Integer.parseInt(br.readLine());
        }
        System.out.println(sum);
        br.close();
    }
}
