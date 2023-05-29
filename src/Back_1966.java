import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Back_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int count = 0;

            LinkedList<int[]> q = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                q.offer(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            while (!q.isEmpty()) {

                int[] front = q.poll();
                boolean maxCheck = true;

                for (int i = 0; i < q.size(); i++) {

                    if (front[1] < q.get(i)[1]) {

                        q.offer(front);
                        for (int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }

                        maxCheck = false;
                        break;
                    }
                }

                if(maxCheck == false){
                    continue;
                }

                count ++;
                if(front[0] == M){
                    break;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
