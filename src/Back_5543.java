import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Back_5543 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int hamburger[] = new int[3];
        int drink[] = new int[2];

        for (int i = 0; i < 3; i++) {
            hamburger[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 2; i++) {
            drink[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(hamburger);
        Arrays.sort(drink);

        System.out.println(hamburger[0] + drink[0] - 50);
        br.close();
    }
}
