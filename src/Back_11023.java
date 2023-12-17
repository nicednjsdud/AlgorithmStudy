import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_11023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = str.split(" ");
        int sum = 0;
        for (int i = 0; i < strArr.length; i++) {
            sum += Integer.parseInt(strArr[i]);
        }
        System.out.println(sum);
        br.close();
    }
}
