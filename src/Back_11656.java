import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Back_11656 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        String[] str = new String[S.length()];
        // when
        for(int i=0;i<S.length();i++){
            String S_charAt="";
            for(int j=i;j<S.length();j++){
                S_charAt+=S.charAt(j);
            }
            str[i]=S_charAt;
        }
        Arrays.sort(str);
        // then
        br.close();
        for (String s : str) {
            System.out.println(s);
        }
    }
}
