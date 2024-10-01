import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Back_2461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        List<PriorityQueue<Long>> classes = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine());
            PriorityQueue<Long> pq = new PriorityQueue<>();
            for (int j = 0; j < M; j++) {
                pq.add(Long.parseLong(token.nextToken()));
            }
            classes.add(pq);
        }
        long answer = Long.MAX_VALUE;
        long max_value = -1;

        PriorityQueue<long[]> pg = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        for(int i = 0; i < N; i++) {
            long value = classes.get(i).remove();
            pg.add(new long[] {value, i});
            if(value > max_value) {
                max_value = value;
            }
        }
        while(true){
            long[] now = pg.remove();
            if(answer>Math.abs(now[0]-max_value)){
                answer = Math.abs(now[0]-max_value);
            }
            if(classes.get((int)now[1]).isEmpty()){
                break;
            }
            long tmp = classes.get((int)now[1]).remove();
            if(tmp > max_value){
                max_value = tmp;
            }
            pg.add(new long[] {tmp, now[1]});
        }
        System.out.println(answer);
    }
}
