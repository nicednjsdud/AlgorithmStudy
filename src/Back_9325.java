import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_9325 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int car_price = Integer.parseInt(br.readLine());
            int option = Integer.parseInt(br.readLine());
            int sum = car_price;
            if (option != 0) {
                for (int j = 0; j < option; j++) {
                    st = new StringTokenizer(br.readLine()," ");
                    int option_count = Integer.parseInt(st.nextToken());
                    int option_price = Integer.parseInt(st.nextToken());
                    sum += option_count * option_price;
                }
            }
            System.out.println(sum);
        }
    }
}
