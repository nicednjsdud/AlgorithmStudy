import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1058 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][N];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'Y') {
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = 9999;
                }
            }
        }
        // 경유지
        for (int k = 0; k < N; k++) {
            // 출발지
            for (int i = 0; i < N; i++) {
                // 도착지
                for (int j = 0; j < N; j++) {
                    if (arr[i][k] + arr[k][j] < arr[i][j]) {
                        arr[i][j] = arr[i][k] + arr[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            int temp = 0;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (arr[i][j] <= 2) {
                        temp++;
                    }
                }
            }
            max = Math.max(max, temp);
        }
        System.out.println(max);
    }

}
