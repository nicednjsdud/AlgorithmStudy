import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back_10799 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();       // 공백 값 입
        Stack<Character> stack = new Stack<>();
        int result = 0;
        // when
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {  // ( 막대기 추가
                stack.push('(');
                continue;
            }
            if (str.charAt(i) == ')') {
                stack.pop();    // ) pop 실행

                if (str.charAt(i - 1) == '(') {   // 그 전 괄호가 열린 괄호면 레이저의미
                    result += stack.size();
                }else{
                    result ++;
                }
            }
        }

        // then
        System.out.println(result);
        br.close();
    }
}
