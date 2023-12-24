import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_11134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            Integer cookie = Integer.parseInt(st.nextToken());
            Integer day = Integer.parseInt(st.nextToken());
            if (cookie % day == 0) {
                System.out.println(cookie / day);
            } else {
                System.out.println(cookie / day + 1);
            }
        }
        br.close();
    }
}
