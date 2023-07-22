import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_7567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cm = 10;
        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                cm += 5;
            }
            else{
                cm += 10;
            }
        }
        br.close();
        System.out.println(cm);
    }
}
