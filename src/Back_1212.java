import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1212 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        // when
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - '0';
            if (n >= 4) {
                sb.append(1);
                n -= 4;
            } else {
                sb.append(0);
            }
            if (n >= 2) {
                sb.append(1);
                n -= 2;
            } else {
                sb.append(0);
            }
            if (n == 1) {
                sb.append(1);
                n -= 1;
            }
            else{
                sb.append(0);
            }
        }
        if(s.charAt(0)=='1'){
            sb.delete(0,2);
        }
        else if(s.charAt(0)=='2'||s.charAt(0)=='3'){
            sb.delete(0,1);
        }
        else if(s.charAt(0)=='0'){
            sb.delete(0,2);
        }
        // then
        System.out.println(sb);
        br.close();
    }
}
