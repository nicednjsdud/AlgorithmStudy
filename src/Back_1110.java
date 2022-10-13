import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1110 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int compare_num = num;    // 비교할 num
        int ten_count;
        int one_count;
        int count = 0;
        // when
        while (true) {
            if (num < 10) {
                num = (num * 10) + num;
                count++;
            } else {
                ten_count = num / 10;
                one_count = num % 10;
                int temp_num = ten_count + one_count;
                num = (one_count * 10) + (temp_num % 10);
                count++;
            }
            if (compare_num == num) {
                break;
            }
        }
        System.out.println(count);
        br.close();
    }
}
