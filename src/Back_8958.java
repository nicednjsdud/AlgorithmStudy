import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_8958 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int total = Integer.parseInt(br.readLine());
        // when
        for (int i = 0; i < total; i++) {
            String str = br.readLine();
            int count = 0;
            int sum = 0;
            if (str.charAt(0) == 'O') {
                count = 1;
                sum = 1;
            }
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;

                }
            }
            sb.append(sum).append("\n");
        }
        // then
        System.out.println(sb);
        br.close();
    }
}
