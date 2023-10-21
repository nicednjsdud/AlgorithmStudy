import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_11170 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int j = N; j <= M; j++) {
                String str = j + "";
                for(int k = 0; k<str.length();k++){
                    if(str.charAt(k) == '0'){
                        count ++;
                    }
                }
            }
            System.out.println(count);
        }
        br.close();
    }
}
