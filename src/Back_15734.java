import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_15734 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(token.nextToken());     // 왼발잡이
        int R = Integer.parseInt(token.nextToken());     // 오른발 잡이
        int A = Integer.parseInt(token.nextToken());     // 양발 잡이
        // when
        int sum = L + R + A;
        int temp = A- Math.abs(L-R);
        // then
        System.out.println(temp >= 0 ? sum - (temp % 2) : sum - Math.abs(temp));
    }
}
