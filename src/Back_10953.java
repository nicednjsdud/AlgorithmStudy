import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_10953 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test_count = Integer.parseInt(br.readLine());
        for (int i = 0; i < Test_count; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine(),",");
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());
            System.out.println(A+B);
        }
        br.close();

    }
}
