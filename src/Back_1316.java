import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1316 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_count = Integer.parseInt(br.readLine());
        int count = 0;
        // when
        for (int i = 0; i < test_count; i++) {
            String group_word = br.readLine();
            String result = "";
            for (int j = 0; j < group_word.length(); j++) {

                // 연속된 문자열 중복 제거
                if (j != group_word.length() - 1) {
                    if (group_word.charAt(j) == group_word.charAt(j + 1)) {
                        continue;
                    } else {
                        result += String.valueOf(group_word.charAt(j));
                    }
                } else {
                    result += String.valueOf(group_word.charAt(j));
                }
            }
            int result_count = 0;
            for (int j = 0; j < result.length(); j++) {
                for (int k = j + 1; k < result.length(); k++) {

                    // 중복 제거후 똑같은 문자가 있다면
                    if (result.charAt(j) == result.charAt(k)) {
                        result_count--;
                        break;
                    }
                }

            }
            if (result_count == 0) {
                count++;
            }
        }
        // then
        System.out.println(count);
        br.close();
    }
}
