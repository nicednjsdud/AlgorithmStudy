import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split("-");
            int left = 0;
            for (int j = 0; j < input[0].length(); j++) {
                left += (input[0].charAt(j) - 'A') * Math.pow(26, input[0].length() - j - 1);
            }
            int right = Integer.parseInt(input[1]);
            if (Math.abs(left - right) <= 100) {
                System.out.println("nice");
            } else {
                System.out.println("not nice");
            }
        }
    }
}
