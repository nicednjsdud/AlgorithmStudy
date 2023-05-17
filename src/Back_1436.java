import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1436 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 0;

        while (true) {
            String str = num + "";
            if (str.contains("666")) {
                count++;
            }
            num++;

            if (count == N) {
                System.out.println(str);
                break;
            }
        }

        br.close();
    }
}
