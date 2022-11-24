import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back_6198 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        long count = 0;
        // when
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }
            stack.push(num);
            count += stack.size() - 1;
        }
        // then
        br.close();
        System.out.println(count);
    }
}
