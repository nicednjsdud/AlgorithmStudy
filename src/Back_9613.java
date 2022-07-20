import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_9613 {
    public static int GCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return GCD(num2, num1 % num2);
        }
    }

    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        StringBuilder sb = new StringBuilder();
        int test_count = Integer.parseInt(br.readLine());
        // when
        for (int i = 0; i < test_count; i++) {
            token = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(token.nextToken());
            long sum = 0;                   // GCD의 합
            int arr[] = new int[n];         // 입력 받을 수 배열 생성
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(token.nextToken());
            }
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum += GCD(arr[j], arr[k]);
                }
            }
            sb.append(sum+"\n");

        }
        // then
        br.close();
        System.out.println(sb);
    }
}
