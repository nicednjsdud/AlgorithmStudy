import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1032 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       String[] files = new String[N];
       for(int i = 0; i < N; i++) {
              files[i] = br.readLine();
       }
         String answer = "";
            for(int i = 0; i < files[0].length(); i++) {
                char c = files[0].charAt(i);
                boolean isSame = true;
                for(int j = 1; j < N; j++) {
                    if(c != files[j].charAt(i)) {
                        isSame = false;
                        break;
                    }
                }
                if(isSame) {
                    answer += c;
                } else {
                    answer += "?";
                }
            }
            System.out.println(answer);
            br.close();
    }
}
