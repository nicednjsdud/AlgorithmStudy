import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back_2512 {

    static int N;
    static int[] arr;
    static int M;
    static int sum = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        sum = 0;
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        M = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        System.out.println(binarySearch());
    }
        static int binarySearch() {
            int start = 0;
            int end = M;

            if (sum <= M) {
                // 합이 최대예산을 안넘으면 바로 리턴
                return arr[N - 1];
            }

            while (start <= end) {
                int current = 0;
                int mid = (start + end) / 2; // 상한액

                for (int i = 0; i < N; i++) {
                    if (arr[i] > mid) {
                        current += mid;
                    } else {
                        current += arr[i];
                    }
                }
                if (current > M) {
                    // 현재 상한가로 예산을 못 맞출경우
                    end = mid - 1;
                } else if (current < M) {
                    // 현재 상한가로 예산을 맞추기 부족할때
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return end;
        }
}
