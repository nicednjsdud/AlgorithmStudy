import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Back_10866 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer token;
        Deque<Integer> deque = new ArrayDeque<>();
        int order_count = Integer.parseInt(br.readLine());
        // when
        for (int i = 0; i < order_count; i++) {
            token = new StringTokenizer(br.readLine(), " ");

            switch (token.nextToken()) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(token.nextToken()));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(token.nextToken()));
                    break;
                case "pop_front":
                    if (deque.size() == 0) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.pollFirst()).append('\n');
                    }
                    break;
                case "pop_back":
                    if (deque.size() == 0) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.pollLast()).append('\n');
                    }
                    break;
                case "size":
                    sb.append(deque.size()).append('\n');
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;
                case "front":
                    if (deque.size() == 0) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.peekFirst()).append('\n');
                    }
                    break;
                case "back":
                    if (deque.size() == 0) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.peekLast()).append('\n');
                    }
                    break;
            }
        }
        // then
        br.close();
        System.out.println(sb);
    }

}