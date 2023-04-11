import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Back_17298 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int value[] = new int[N];

        for (int i = 0; i < N; i++) {
            value[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {

            while(!stack.isEmpty() && value[stack.peek()] < value[i]){
                value[stack.pop()] = value[i];
            }
            stack.push(i);
        }
        while(!stack.empty()){
            value[stack.pop()] = -1;
        }

        for(int i = 0; i<N;i++){
            sb.append(value[i]).append(" ");
        }
        System.out.println(sb);
    }
}
