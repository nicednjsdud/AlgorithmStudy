import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_1260 {

    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int[][] arr;
    static int N, M, V;
    static Queue<Integer> q = new LinkedList<>();

    public static void dfs(int V) {
        check[V] = true;
        sb.append(V + " ");
        for (int i = 0; i <= N; i++) {
            if (arr[V][i] == 1 && !check[i])
                dfs(i);
        }
    }

    public static void bfs(int V) {
        q.add(V);   // 정점 위치
        check[V] = true;

        while (!q.isEmpty()) {
            V = q.poll();
            sb.append(V + " ");
            for (int i = 1; i <= N; i++) {
                if (arr[V][i] == 1 && !check[i]) {
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        N = Integer.parseInt(token.nextToken());
        M = Integer.parseInt(token.nextToken());
        V = Integer.parseInt(token.nextToken());

        arr = new int[N+1][N+1];
        check = new boolean[N+1];

        for(int i=0;i<M;i++){
            token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }
        dfs(V);
        sb.append("\n");
        check = new boolean[N+1];

        bfs(V);
        System.out.println(sb);
        br.close();
    }
}
