import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Back_2460 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            String[] input = br.readLine().split(" ");
            sum += Integer.parseInt(input[1]) - Integer.parseInt(input[0]);
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
