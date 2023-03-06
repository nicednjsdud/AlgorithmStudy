import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_9461 {

    static Long arr[] = new Long[101];

    public static void main(String[] args) throws IOException {

        // 점화식 = func(N) = func(N-2) + func(N-3)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            arr[0] = 0L;
            arr[1] = 1L;
            arr[2] = 1L;
            arr[3] = 1L;
            func(N);
            sb.append(func(N)).append("\n");
        }
        System.out.println(sb);
        br.close();
    }

    public static long func(int N){
        if(arr[N] == null){
            arr[N] = func(N-2) + func(N-3);
        }
        return arr[N];
    }
}
