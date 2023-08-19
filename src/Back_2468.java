
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class Back_2468 {

    static List<Integer> list = new ArrayList<>();
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (!list.contains(map[i][j])) {
                    list.add(map[i][j]);
                }
            }
        }
        int max = 0;
        for (int height : list) {
            visited = new boolean[N][N];
            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && map[i][j] >= height) {
                        dfs(i, j, height);
                        count++;
                    }
                }
            }
            max = Math.max(count, max);
        }
        System.out.println(max);
    }

    private static void dfs(int x, int y, int height) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX >= 0 && newY >= 0 && newX < N && newY < N && !visited[newX][newY] && map[newX][newY] >= height) {
                dfs(newX, newY, height);
            }
        }
    }
}
