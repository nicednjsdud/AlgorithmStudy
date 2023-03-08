import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_11723 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        int S = 0;
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            String oper = st.nextToken();
            if (oper.equals("all")) S = (1 << 21) - 1;
            else if (oper.equals("empty")) S = 0;
            else {
                int num = Integer.parseInt(st.nextToken());
                if (oper.equals("add")) {
                    S |= (1 << num);
                } else if (oper.equals("remove")) {
                    S &= ~(1 << num);
                } else if (oper.equals("check")) {
                    sb.append((S & (1 << num)) != 0 ? 1 : 0).append("\n");
                } else if (oper.equals("toggle")) {
                    S ^= (1 << num);
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}
