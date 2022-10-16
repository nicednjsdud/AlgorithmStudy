import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_2908 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first_num = Integer.parseInt(st.nextToken());
        int next_num = Integer.parseInt(st.nextToken());
        // when
        first_num = (first_num % 10) * 100 + ((first_num / 10) % 10) * 10 + (first_num / 100);
        next_num = (next_num % 10) * 100 + ((next_num / 10) % 10) * 10 + (next_num / 100);

        if (first_num > next_num)
            System.out.println(first_num);
        else
            System.out.println(next_num);

        // then
        br.close();
    }
}
