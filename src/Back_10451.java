import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_10451 {

    static int map[];
    static boolean visited[];
    static int cycle;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            cycle = 0;
            map = new int[N + 1];
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; j++) {
                map[j] = Integer.parseInt(st.nextToken());
            }
            visited = new boolean[N + 1];
            for (int k = 1; k < N + 1; k++) {
                if(!visited[k]){
                    dfs(k);
                    cycle++;
                }
            }
            sb.append(cycle).append("\n");
        }
        System.out.println(sb);
        br.close();

    }

    private static void dfs(int start) {
        visited[start] = true;

        int next = map[start];
        if(!visited[next]){
            dfs(map[start]);
        }
    }
}
