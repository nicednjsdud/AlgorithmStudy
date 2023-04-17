import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Back_18258 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            String str = st.nextToken();
            if(str.equals("push")){
                int num = Integer.parseInt(st.nextToken());
                deque.offer(num);
            }
            else if(str.equals("front")){
                Integer peek = deque.peek();
                if(peek == null){
                    sb.append(-1).append("\n");
                }
                else{
                    sb.append(peek).append("\n");
                }
            }
            else if(str.equals("pop")){
                Integer poll = deque.poll();
                if(poll == null){
                    sb.append(-1).append("\n");
                }
                else{
                    sb.append(poll).append("\n");
                }
            }
            else if(str.equals("size")){
                int size = deque.size();
                sb.append(size).append("\n");
            }
            else if(str.equals("empty")){
                if(deque.isEmpty()) {
                    sb.append(1).append("\n");
                }
                else{
                    sb.append(0).append("\n");
                }
            }
            else if(str.equals("back")){
                Integer integer = deque.peekLast();
                if(integer == null){
                    sb.append(-1).append("\n");
                }
                else{
                    sb.append(integer).append("\n");
                }
            }

        }
        br.close();
        System.out.println(sb);
    }
}
