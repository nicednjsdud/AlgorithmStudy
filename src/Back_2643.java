
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Back_2643 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<int[]>();

        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
            // 폭 보다 길이가 더크면
            if (arr[i][1] > arr[i][0]) {
                list.add(new int[]{arr[i][1], arr[i][0]});
            } else {
                list.add(new int[]{arr[i][0], arr[i][1]});
            }
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });
        int count = 0;
        int[] dp = new int[N];
        for (int i = 0; i < N; i++) {
            int cur[] = list.get(i);
            for (int j = 0; j < i; j++){
                int compare[] = list.get(j);
                //
                if(cur[0] >= compare[0] && cur[1] >= compare[1]){
                    dp[i] = Math.max(dp[i], dp[j]);
                }

            }
            dp[i]++;
            count = Math.max(count,dp[i]);
        }
        System.out.println(count);
    }
}
