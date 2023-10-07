import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2774 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            boolean[] check = new boolean[11];
            for (int j = 0; j < check.length; j++) {
                check[j] = false;
            }
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                int num = Integer.parseInt(String.valueOf(str.charAt(j)));
                if(check[num] == false){
                    check[num] = true;
                    count++;
                }
            }
            System.out.println(count);
        }
        br.close();
    }
}
