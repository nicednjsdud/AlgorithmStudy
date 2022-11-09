import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back_1874 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int start = 0; // 초기화 용
        // when
        while (n-- > 0) {

            int num = Integer.parseInt(br.readLine());

            if (num > start) {
                for (int i = start + 1; i <= num; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start = num;
            }
            // TOP이 num(입력받은 수) 이랑 같지 않다면
            else if (num != stack.peek()) {
                System.out.println("NO");
                System.exit(0);
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        // then
        br.close();
        System.out.println(sb);
    }
}
