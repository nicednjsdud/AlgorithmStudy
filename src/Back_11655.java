import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_11655 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        StringBuilder sb = new StringBuilder();
        // when
        for(int i=0;i<S.length();i++) {
            int password = S.charAt(i);

            if(password>=65 && password<=90){
                password+=13;           // 대문자 구별
                if(password>90){        // 대문자 Z (90) 보다 크다면
                    int shift = password-91;
                    password = 65 + shift;  // 다시 65부터 돌리기
                }
            }
            else if(password>=97 && password <= 122){
                password+=13;           // 소문자 구별
                if(password>122){       // 소문자 z (122)보다 크다면
                    int shift = password - 123;
                    password = 97 + shift;  // 97부터 다시 돌리기
                }
            }
            sb.append((char)password);
        }
        // then
        br.close();
        System.out.println(sb);
    }
}
