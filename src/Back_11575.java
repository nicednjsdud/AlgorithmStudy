import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_11575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            String s = br.readLine();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                int c = s.charAt(j);
                int result = (a * (c - 'A') + b) % 26;
                sb.append((char) (result + 'A'));
            }
            System.out.println(sb);
        }
    }
}
