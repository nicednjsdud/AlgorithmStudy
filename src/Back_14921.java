import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_14921 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int ans = 1000000000;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int val = arr[start] + arr[end];
            if (Math.abs(ans) > Math.abs(val)) ans = val;
            if (val == 0) break;
            else if(val > 0) end --;
            else start ++;
        }

        System.out.println(ans);
        br.close();
    }
}
