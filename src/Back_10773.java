import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back_10773 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());
        int sum = 0;

        // 최근거를 지워야하기때문에 stack[0]은 넣고시작
        stack.push(num);
        // when
        for (int i = 1; i < K; i++) {
            num = Integer.parseInt(br.readLine());
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }
        // then
        System.out.println(sum);
        br.close();
    }
}
