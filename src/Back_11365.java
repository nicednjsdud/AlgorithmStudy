import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if (str.equals("END")) {
                break;
            } else {
                StringBuffer tempStr = new StringBuffer(str);
                String reverse = tempStr.reverse().toString();
                sb.append(reverse).append("\n");
            }

        }
        System.out.println(sb);
        br.close();
    }
}
