import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_16953 {

    static long A, B;
    static int count;
    static Queue<Long> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        System.out.println(bfs());

    }

    private static int bfs() {
        q.add(A);
        count = 1;
        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Long num = q.poll();
                if (num == B) {
                    return count;
                }
                if (num * 2 <= B) q.add(num * 2);
                if ((num * 10) + 1 <= B) q.add((num * 10) + 1);
            }
            count++;
        }
        return -1;
    }
}
