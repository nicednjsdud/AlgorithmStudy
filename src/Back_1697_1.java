import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_1697_1 {
    public static void main(String[] args) throws IOException {

        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (N >= K) {
            System.out.println(N - K);
        } else {
            int[] arr = new int[100001];

            for (int i = 0; i < 100001; i++) {
                arr[i] = 0;
            }

            queue.offer(N);

            while (!queue.isEmpty()) {
                Integer position = queue.poll();
                for (int i = 0; i < 3; i++) {
                    int nowX = position;
                    if (i == 0) {
                        nowX += 1;
                    } else if (i == 1) {
                        nowX -= 1;
                    } else {
                        nowX *= 2;
                    }



                    if(nowX >= 0 && nowX < arr.length && arr[nowX] == 0){
                        queue.add(nowX);
                        arr[nowX] += arr[position] + 1;
                    }

                    if (nowX == K) {
                        queue = new LinkedList<>();
                        break;
                    }
                }
            }
            System.out.println(arr[K]);
            br.close();
        }

    }
}
