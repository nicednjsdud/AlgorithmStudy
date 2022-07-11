import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_10824 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // when
        String[] str = br.readLine().split(" ");    // 빈칸 자르기

        long num1 = Long.parseLong(str[0]+str[1]);
        long num2 = Long.parseLong(str[2]+str[3]);

        sb.append(num1+num2);

        // then
        br.close();
        System.out.println(sb);

    }
}
