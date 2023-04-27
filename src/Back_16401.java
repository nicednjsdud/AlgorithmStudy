import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back_16401 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        long result = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        long start = 0;
        long end = arr[N - 1];
        while (start <= end) {
            int count = 0;
            long mid = (start + end) / 2;

            for (int i = 0; i < N; i++) {
                count += arr[i] / mid;
            }

            if (count >= M) {
                if (result < mid) result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        br.close();
        System.out.println(result);
    }
}
