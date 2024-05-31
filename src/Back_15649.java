import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_15649 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        boolean[] visited = new boolean[N];
        dfs(arr, visited, 0, N, M);


    }

    private static void dfs(int[] arr, boolean[] visited, int i, int n, int m) {
        if(i == m){
            for(int j = 0; j < m; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
            return;
        }
        for(int j = 0; j < n; j++){
            if(!visited[j]){
                visited[j] = true;
                arr[i] = j + 1;
                dfs(arr, visited, i + 1, n, m);
                visited[j] = false;
            }
        }
    }
}
