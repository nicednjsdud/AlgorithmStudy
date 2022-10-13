import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_25304 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total_price = Integer.parseInt(br.readLine());
        int total_count = Integer.parseInt(br.readLine());
        // when
        for (int i = 0; i < total_count; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(token.nextToken());
            int count = Integer.parseInt(token.nextToken());
            total_price -= (price * count);
        }
        // then
        if( total_price == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
        br.close();
    }
}
