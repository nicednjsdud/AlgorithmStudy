import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10989 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int Test_count = Integer.parseInt(br.readLine());   // 테스트 개수
        int arr[] = new int[10001];                         // 배열 생성

        // when
        for (int i = 0; i < Test_count; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }
        // 0은 없으므로 1부터시작
        for (int i = 1; i < 10001; i++) {

            // 똑같은 수가 나올수 있을때를 대비
            while (arr[i] > 0) {
                sb.append(i).append('\n');
                arr[i]--;
            }
        }
        // then
        System.out.println(sb);
        br.close();

    }
}
