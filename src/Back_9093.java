import java.io.*;
import java.util.Stack;

public class Back_9093 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        // when
        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine() +"\n";
            for(char ch : str.toCharArray()){
                if(ch == ' ' || ch== '\n'){

                    while(!stack.isEmpty()){
                        // 뒤집기
                        bw.write(stack.pop());
                    }
                    bw.write(ch);
                }
                else stack.push(ch);
            }
        }

        // then
        br.close();
        bw.flush();
        bw.close();
    }
}
