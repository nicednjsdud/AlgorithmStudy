import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10821 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] temp = str.split(",");
        System.out.println(temp.length);
        br.close();
    }
}
