import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_15652 {
    public static int[] arr;
    public static int N, M;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        dfs(1, 0);

    }

    private static void dfs(int start, int depth) {

        if (depth == M) {
            for (int i : arr)
                System.out.print(i + " ");
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) {
            arr[depth] = i;
            dfs(i, depth + 1);
        }
    }
}
