import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Back_8979 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int rank = 1;
        int country[][] = new int[N][3];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            country[i][0] = Integer.parseInt(st.nextToken());
            if(country[i][0] == K)
                K = i;

            for (int j = 0; j < 3; j++) {
                country[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            if(country[i][0] > country[K][0])
                rank ++;
            else if(country[i][0] == country[K][0] && country[i][1] > country[K][1])
                rank++;
            else if(country[i][0] == country[K][0] && country[i][1] == country[K][1] && country[i][2] > country[K][2])
                rank++;
        }
        System.out.println(rank);
        br.close();
    }
}
