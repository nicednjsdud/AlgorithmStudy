import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back_2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                // 맞지 않은 괄호
                if(stack.isEmpty() || stack.peek() != '('){
                    System.out.println(0);
                    return;
                }
                // () 인 괄호열의 값은 2
                if(s.charAt(i-1) == '('){
                    stack.pop();
                    stack.push('2');
                }else{
                    int num = 0;
                    while(!stack.isEmpty() && stack.peek() != '('){
                        // 맞지 않은 괄호
                        if(stack.peek() == '['){
                            System.out.println(0);
                            return;
                        }
                        num += Integer.parseInt(stack.pop().toString());
                    }
                    // 맞지 않은 괄호
                    if(stack.isEmpty()){
                        System.out.println(0);
                        return;
                    }
                    stack.pop();
                    stack.push((char)(num*2+'0'));
                }
            }else if(s.charAt(i) == ']'){
                // 맞지 않은 괄호
                if(stack.isEmpty() || stack.peek() != '['){
                    System.out.println(0);
                    return;
                }
                if(s.charAt(i-1) == '['){
                    stack.pop();
                    stack.push('3');
                }else{
                    int num = 0;
                    while(!stack.isEmpty() && stack.peek() != '['){
                        if(stack.peek() == '('){
                            System.out.println(0);
                            return;
                        }
                        num += Integer.parseInt(stack.pop().toString());
                    }
                    if(stack.isEmpty()){
                        System.out.println(0);
                        return;
                    }
                    stack.pop();
                    stack.push((char)(num*3+'0'));
                }
            }
        }
    }
}
