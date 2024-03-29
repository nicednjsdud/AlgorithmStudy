import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_11724 {

    static int arr[][];
    static boolean node[];
    static int N, count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N + 1][N + 1];
        node = new boolean[1001];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        count = 0;
        for (int i = 1; i <= N; i++) {
            if (node[i] == false) {
                DFS(i);
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }

    static void DFS(int value) {

        if (node[value] == true) {
            return;
        } else {
            node[value] = true;
            for (int i = 1; i <= N; i++) {
                if (arr[value][i] == 1) {
                    DFS(i);
                }
            }
        }
    }
}
