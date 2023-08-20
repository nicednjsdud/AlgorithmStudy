import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_1697 {

    static int N, K;
    static int arr[];
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        if (N >= K) {
            System.out.println(N - K);
        } else {
            System.out.println(bfs());
        }
    }

    private static int bfs() {
        arr = new int[100001];
        queue.add(N);
        arr[N] = 1;
        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (int i = 0; i < 3; i++) {
                int nx;
                if (i == 0) {
                    nx = x + 1;
                } else if (i == 1) {
                    nx = x - 1;
                } else {
                    nx = x * 2;
                }
                if (nx == K) {
                    return arr[x];
                }
                if (nx >= 0 && nx < arr.length && arr[nx] == 0) {
                    arr[nx] = arr[x] + 1;
                    queue.add(nx);
                }
            }
        }
        return 0;
    }
}
