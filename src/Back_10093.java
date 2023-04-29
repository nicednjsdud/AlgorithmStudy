import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_10093 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        if (A > B) {
            System.out.println(A - B - 1);
            for (long i = B + 1; i < A; i++) {
                sb.append(i).append(" ");

            }
            System.out.println(sb);
        } else if (A < B) {
            System.out.println(B - A - 1);
            for (long i = A + 1; i < B; i++) {
                sb.append(i).append(" ");

            }
            System.out.println(sb);
        } else {
            System.out.println(0);
        }
        br.close();
    }
}
