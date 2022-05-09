import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_14581 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();                 // 문자열입력

        // then
        System.out.println(":fan::fan::fan:");
        System.out.println(":fan::"+str+"::fan:");
        System.out.println(":fan::fan::fan:");

        br.close();
    }
}
