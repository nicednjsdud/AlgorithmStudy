import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_20922 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());
        int K = Integer.parseInt(token.nextToken());
        int arr[] = new int[N];
        token = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }
        int max = 0;

        for(int st = 0, en = 0; st < N; st++) {
            int[] count = new int[100001];
            count[arr[st]]++;
            int len = 1;

            while(en < N - 1) {
                if(count[arr[en + 1]] < K) {
                    count[arr[++en]]++;
                    len++;
                    max = Math.max(max, len);
                } else {
                    count[arr[st]]--;
                    len--;
                    st++;
                }
            }
        }
        System.out.println(max);
    }
}
