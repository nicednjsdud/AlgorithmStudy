import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_13900 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long arr[] = new long[N + 1];
        long cumSum[] = new long[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr[0] = 0L;
        cumSum[0] = 0L;
        for (int i = 1; i <= N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            cumSum[i] = arr[i] + cumSum[i - 1];
        }

        long sum = 0L;
        for (int i = 2; i <= N; i++) {
            sum += arr[i] * cumSum[i - 1];
        }
        System.out.println(sum);
        br.close();
    }
}
