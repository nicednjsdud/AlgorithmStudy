import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10808 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
            int alphabet[]=new int[26];
        // when
        for(int i=0;i<str.length();i++){
            int alphabet_count=str.charAt(i)-97;
            alphabet[alphabet_count]++;
        }
        // then
        for (int i : alphabet) {
            System.out.print(i+" ");
        }
        br.close();
    }
}
