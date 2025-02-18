import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Back_7562 {

    static class Point {
        int x;
        int y;
        int count;

        public Point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i< T; i++){
            int I = Integer.parseInt(br.readLine());
            Point[] points = new Point[2]; // 시작점과 끝점
            for (int j = 0; j < 2; j++) {
                st = new StringTokenizer(br.readLine());

                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());

                points[j] = new Point(start, end, 0);
            }
            System.out.println(bfs(points,I));
        }
    }

    private static int bfs(Point[] points, int I) {
        Queue<Point> q = new LinkedList<>();
        q.offer(points[0]);

        boolean[][] visited = new boolean[I][I];
        visited[points[0].x][points[0].y] = true;
        while(!q.isEmpty()){
            Point p = q.poll();
            if(p.x == points[1].x && p.y == points[1].y){
                return p.count;
            }

            for(int i = 0; i< 8; i++){
                int dirX = p.x + dx[i];
                int dirY = p.y + dy[i];

                if(dirX < 0 || dirX >=I || dirY < 0 || dirY >= I){
                    continue;
                }

                if(!visited[dirX][dirY]){
                    visited[dirX][dirY] = true;
                    q.offer(new Point(dirX, dirY, p.count + 1));
                }
            }
        }
        return -1;
    }

}
