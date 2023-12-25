import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = str.split(",");
        int sum = 0;
        for (String s : strArr) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
        br.readLine();

    }
}
