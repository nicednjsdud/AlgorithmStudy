import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_11050 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int mo_value = 1;
        int temp = 1;
        int de_value = 1;

        for (int i = 0; i < N; i++) {
            mo_value = mo_value * (N - i);
        }

        for (int i = 0; i < N - K; i++) {
            temp = temp * (N - K - i);
        }

        for (int i = 0; i < K; i++) {
            de_value = de_value * (K - i);
        }
        System.out.println(mo_value / (de_value * temp));
        br.close();
    }
}
