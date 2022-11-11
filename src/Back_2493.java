import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Back_2493 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<int[]> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        // when
        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty()) {
                if (stack.peek()[1] >= num) {
                    sb.append(stack.peek()[0] + " ");
                    break;
                }
                stack.pop();
            }
            if (stack.isEmpty()) {
                sb.append("0 ");
            }
            stack.push(new int[]{i, num});
        }
        // then
        br.close();
        System.out.println(sb);
    }
}
