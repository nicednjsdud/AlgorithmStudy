import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_10214 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (T > 0) {

            int yCount = 0;
            int kCount = 0;

            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                yCount += Integer.parseInt(st.nextToken());
                kCount += Integer.parseInt(st.nextToken());
            }

            if (yCount > kCount) {
                System.out.println("Yonsei");
            } else if (yCount < kCount) {
                System.out.println("Korea");
            }
            else{
                System.out.println("Draw");
            }
            T--;
        }
        br.close();
    }
}
