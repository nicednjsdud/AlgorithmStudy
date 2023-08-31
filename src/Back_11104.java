import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_11104 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long sum = 0;
            long binary = 1;
            String str = br.readLine();
            for (int j = str.length() - 1; j >= 0; j--) {
                if (str.charAt(j) == '1') {
                    sum += binary;
                }
                binary *= 2;

            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
