import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_5014 {

    static int F, S, G, U, D;
    static int visited[];
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        visited = new int[F + 1];
        bfs();
        br.close();
    }

    private static void bfs() {
        q.add(S);
        visited[S] = 1;

        while (!q.isEmpty()) {

            int C = q.poll();

            if (C == G) {
                System.out.println(visited[C] - 1);
            }
            if (C + U <= F && visited[C + U] == 0) {
                visited[C + U] = visited[C] + 1;
                q.add(C + U);
            }
            if (C - D > 0 && visited[C - D] == 0) {
                visited[C - D] = visited[C] +1;
                q.add(C - D);
            }
        }
        if(visited[G] == 0){
            System.out.println("use the stairs");
        }
    }
}
