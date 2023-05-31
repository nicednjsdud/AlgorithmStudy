import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_6603 {

    static int arr[];
    static boolean check[];

    static int T;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            T = Integer.parseInt(st.nextToken());
            if (T == 0) {
                break;
            }
            arr = new int[T];
            check = new boolean[T];
            for (int i = 0; i < T; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                check[i] = false;
            }
            dfs(0, 0);
            System.out.println();
        }
    }

    private static void dfs(int depth, int start) {
        if (depth == 6) {
            for (int i = 0; i < T; i++) {
                if (check[i]) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
        for (int i = start; i < T; i++) {
            check[i] = true;
            dfs(depth + 1, i + 1);
            check[i] = false;
        }
    }
}
