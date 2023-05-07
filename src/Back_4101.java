import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_4101 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        boolean checkFlag = true;
        while(checkFlag){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A == 0 && B == 0){
                checkFlag = false;
            }
            else{
                if(A > B){
                    sb.append("Yes").append("\n");
                }
                else {
                    sb.append("No").append("\n");
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}
