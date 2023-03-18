import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_13305 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        long[] distance = new long[N - 1];    // 거리
        long[] cost = new long[N];          // 비용

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            distance[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cost[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long minCost = cost[0];  // 처음에 기름을 넣고 가야하므로 처음이 가장 낮은 비용

        for (int i = 0; i < N - 1; i++) {

            if (cost[i] < minCost) {
                minCost = cost[i];
            }
            sum += (minCost * distance[i]);
        }
        System.out.println(sum);
        br.close();
    }
}
