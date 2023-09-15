import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_10797 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            int car = Integer.parseInt(st.nextToken());
            if (num == car) {
                count ++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
