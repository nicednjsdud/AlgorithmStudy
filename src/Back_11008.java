import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_11008 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String[] input = br.readLine().split(" ");
            String S = input[0];
            String P = input[1];
            int count = 0;
            int index = 0;
            while (index < S.length()) {
                if (S.substring(index).startsWith(P)) {
                    count++;
                    index += P.length();
                } else {
                    count++;
                    index++;
                }
            }
            System.out.println(count);
        }
    }
}
