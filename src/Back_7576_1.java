import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_7576_1 {

    public static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public static void main(String[] args) throws IOException {

        int[] dX = {1, 0, -1, 0};
        int[] dY = {0, 1, 0, -1};
        int day = 0;
        int M, N;
        int[][] tomato;
        boolean[][] visited;
        Queue<Pair> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        tomato = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String[] tokens = str.split(" ");
            for (int j = 0; j < M; j++) {
                int integer = Integer.parseInt(tokens[j]);
                tomato[i][j] = integer;
                if (integer == 1) {
                    queue.offer(new Pair(j, i));
                    visited[i][j] = true;
                }
            }
        }

        if (queue.isEmpty()) {
            System.out.println(-1);
        }
        else {
            while (!queue.isEmpty()) {
                Pair pair = queue.poll();

                for (int i = 0; i < 4; i++) {
                    int dirX = pair.x + dX[i];
                    int dirY = pair.y + dY[i];

                    if(dirX >=0 && dirX < M && dirY >=0 && dirY < N &&
                            !visited[dirY][dirX] && tomato[dirY][dirX] == 0)
                    {
                        visited[dirY][dirX] = true;
                        queue.offer(new Pair(dirX,dirY));
                        tomato[dirY][dirX] = tomato[pair.y][pair.x] + 1;
                    }
                }
            }
            boolean zeroCheck = false;
            for(int i =0; i< N ;i++){
                for(int j = 0; j< M; j++) {
                    if (tomato[i][j] == 0) {
                        zeroCheck =true;
                        break;
                    }
                    day = Math.max(day, tomato[i][j]);
                }
            }
            System.out.println(zeroCheck ? -1 : day - 1);
            br.close();
        }
    }
}
