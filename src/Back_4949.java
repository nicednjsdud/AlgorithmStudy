import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back_4949 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if (str.equals(".")) break;

            String result = compare_str(str);
            sb.append(result).append("\n");
        }
        System.out.println(sb);
        br.close();
    }

    private static String compare_str(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            // 여는 괄호가 대괄호 혹은 소괄호 일 경우
            if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            }
            // 닫는 괄호가 소괄호 일 경우
            else if (str.charAt(i) == ')') {

                // 스택이 비어있거나 여는 괄호가 ( 가 아닐경우
                if (stack.empty() || stack.peek() != '('){
                    return "no";
                }
                else stack.pop();
            }
            // 닫는 괄호가 대괄호 일 경우
            else if (str.charAt(i) == ']') {

                // 스택이 비어있거나 여는 괄호가 [ 가 아닐경우
                if (stack.empty() || stack.peek() != '['){
                    return "no";
                }
                else stack.pop();
            }

        }
        if(stack.empty()) return "yes";
        else return "no";
    }
}
