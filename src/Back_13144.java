import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_13144 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        boolean isVisited[] = new boolean[100001];

        StringTokenizer token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }

        int count = 0;

        for (int st = 0; st < N; st++) {
            int end = st;
            while(end + 1 < N && !isVisited[arr[end + 1]]){
                end ++;
                isVisited[arr[end]] = true;
            }
            count += end - st + 1;
        }
        System.out.println(count);
        br.close();
    }
}
