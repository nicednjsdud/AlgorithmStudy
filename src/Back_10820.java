import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10820 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";
        // when
        while((str= br.readLine())!=null){      // 입력 개수가 주어지지 않았으므로 입력이 끝날때까지
            char ch[]=str.toCharArray();
            int small_alphabet = 0;
            int big_alphabet = 0;
            int num_count = 0;
            int empty_count = 0;
            for (char c : ch) {
                if('a'<=c && c<='z'){
                    small_alphabet++;   // 소문자
                }
                else if('A'<=c && c<='Z'){
                    big_alphabet++;     // 대문자
                }
                else if('0'<=c && c<='9'){
                    num_count++;        // 숫자
                }
                else{
                    empty_count++;      // 빈칸
                }

            }
            sb.append(small_alphabet).append(" ").append(big_alphabet+" ").
                    append(num_count+" ").append(empty_count).append('\n');
        }

        // then
        br.close();
        System.out.println(sb);
    }
}
