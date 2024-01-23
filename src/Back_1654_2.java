import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1654_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int arr[] = new int[1000001];
        long max = 0;

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) max = arr[i];
        }
        max++;

        long min = 0;
        while (max > min) {
            long mid = (max + min) / 2;

            long cur = 0;
            for (int i = 0; i < arr.length; i++) {
                cur += arr[i] / mid;
            }
            if (cur < N) max = mid;
            else min = mid + 1;
        }
        System.out.println(min - 1);
        br.close();
    }
}
