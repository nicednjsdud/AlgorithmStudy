import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Back_11650 {

    public static void main(String[] args) throws IOException {


        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][2];
        // when
        StringTokenizer token;
        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(token.nextToken());
            arr[i][1] = Integer.parseInt(token.nextToken());
        }
        Arrays.sort(arr, (s1, s2) -> {
            if (s1[0] == s2[0]) {
                return s1[1] - s2[1];
            } else {
                return s1[0] - s2[0];
            }
        });
        // then
        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
        }
        System.out.println(sb);
        br.close();
    }

}
