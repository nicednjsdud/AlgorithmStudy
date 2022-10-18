import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2941 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String cro_alphabet[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        // when
        for(int i=0;i <cro_alphabet.length;i++){
            if(str.contains(cro_alphabet[i])){
                str = str.replace(cro_alphabet[i], "@");
            }
        }

        // then
        System.out.println(str.length());
        br.close();
    }
}
