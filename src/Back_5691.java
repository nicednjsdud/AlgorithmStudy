import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_5691 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            Long A = Long.parseLong(st.nextToken());
            Long B = Long.parseLong(st.nextToken());
            Long result = 0L;
            if (A == 0 && B == 0) {
                break;
            }
            // when
            result = A - (B - A);
            sb.append(result).append("\n");
        }
        // then
        br.close();
        System.out.println(sb);
    }
}
