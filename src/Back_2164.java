import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Back_2164 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }
        while(q.size() > 1){
            q.poll();   // 맨앞 버림
            q.offer(q.poll());  // 두번째를 버리면서 맨뒤에 삽입
        }
        System.out.println(q.poll());
    }
}
