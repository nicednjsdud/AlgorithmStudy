import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_9012 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test_count = Integer.parseInt(br.readLine());
        String str = "";
        int check = 0;
        // when
        for (int i = 0; i < test_count; i++) {
            str = br.readLine();
            if (str.charAt(0) == ')' || str.length() % 2 != 0) {    // 첫시작이 ) 이거나 홀수이면
                check = -1;
            } else {
                check = 1;      // yes or no check 첫 단어가 (로 시작했으니 1부터시작
                for (int j = 1; j < str.length(); j++) {                // ( 이면 체크 ++ )이면 체크 --
                    if (check >= 0) {
                        if (str.charAt(j) == '(') {
                            check++;
                        } else if (str.charAt(j) == ')') {
                            check--;
                        }
                    } else {
                        break;
                    }
                }

            }
            if (check == 0) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }

        // then
        System.out.println(sb);
        br.close();
    }
}
