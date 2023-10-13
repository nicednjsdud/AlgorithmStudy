import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1453 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        boolean[] check = new boolean[101];
        for (int i = 0; i <= 100; i++) {
            check[i] = false;
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int people = Integer.parseInt(st.nextToken());
            if(!check[people]){
                check[people] = true;
            }
            else{
                count ++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
