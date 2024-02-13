import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_array_test {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(func2(arr, N));
    }

    private static int func2(int[] arr, int n) {
        int occur[] = new int[101];
        for (int i = 0; i < n; i++) {
            if(occur[100-arr[i]] == 1) return 1;
            occur[arr[i]] = 1;
        }
        return 0;
    }
}
