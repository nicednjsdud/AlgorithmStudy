import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2839 {

    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        // when

        // 4나 7은 떨어지지 않음.
        if (N == 4 || N == 7) {
            count = -1;
        }
        // 5로 나누어 떨어질때
        else if ((N % 5 == 0)) {
            count = N / 5;
        }
        // 나머지가 1 혹은 3일때 ex) 6 , 11 || 8 , 13
        else if ((N % 5) == 1 || (N % 5) == 3) {
            count = (N / 5) + 1;

            // 나머지가 2 혹은 4일때 ex) 12 , 17 || 9 , 14
        } else if ((N % 5) == 2 || (N % 5) == 4) {

            count = (N / 5) + 2;
        }

        // then
        System.out.println(count);
        br.close();
    }
}
