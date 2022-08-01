import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 에라토스테네스 체 방법으로 풀어보기
public class Back_1929 {

    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(token.nextToken());
        int N = Integer.parseInt(token.nextToken());
        boolean arr[] = new boolean[N + 1];
        // when
        arr[0] = true;
        arr[1] = true;        // 0 하고 1은 빼주기

        for (int i = 2; i < Math.sqrt(N + 1); i++) {
            for (int j = i * i; j < N + 1; j += i) {
                arr[j] = true;
            }
        }
        // then
        br.close();
        for (int i = M; i < N + 1; i++) {
            if (arr[i] == false) {
                System.out.println(i);
            }
        }


    }
}
