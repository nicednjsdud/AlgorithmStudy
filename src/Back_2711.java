import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_2711 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int pos = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            String rebStr = "";

            for (int j = 0; j < str.length(); j++) {
                if(j != pos - 1){
                    rebStr += str.charAt(j);
                }
            }
            sb.append(rebStr).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
