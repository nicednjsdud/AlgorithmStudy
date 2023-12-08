import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_9295 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int sum= 0;
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            sum = first + second;
            System.out.println("Case " + (i+1) + ": " + sum);
        }
        br.close();
    }

}
