import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_2644 {

    static int n, p1, p2;
    static int[][] map;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        p1 = Integer.parseInt(st.nextToken());
        p2 = Integer.parseInt(st.nextToken());

        map = new int[n + 1][n + 1];
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = 1;
            map[y][x] = 1;
        }
        arr = new int[n + 1];

        BFS(p1, p2);
        if (arr[p2] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(arr[p2]);
        }
        br.close();
    }

    private static void BFS(int start, int end) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(start);
        while (!qu.isEmpty()) {

            int v = qu.poll();
            if (v == end) {
                break;
            }
            for (int i = 1; i <= n; i++) {
                if (map[v][i] == 1 && arr[i] == 0) {
                    arr[i] = arr[v] + 1;
                    qu.add(i);
                }
            }
        }
    }
}
