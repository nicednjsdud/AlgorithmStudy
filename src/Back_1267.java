import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1267 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int Y_price = 0;
        int M_price = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int call_time = Integer.parseInt(st.nextToken());
            // when
            // 입력한 수에서 영식 / 만식을 각 통화의 개수에 대입
            // 전화시간이 60초 아래면
            if (call_time < 60) {
                if (call_time < 30) {
                    Y_price += 10;
                } else {
                    Y_price += 20;
                }
                M_price += 15;
            } else {
                Y_price += (call_time / 30 + 1) * 10;
                M_price += (call_time / 60 + 1) * 15;

            }
        }
        // then
        if (Y_price > M_price) {
            System.out.println("M " + M_price);
        } else if (Y_price < M_price) {
            System.out.println("Y " + Y_price);
        } else {
            System.out.println("Y M " + Y_price);
        }
        br.close();
    }
}
