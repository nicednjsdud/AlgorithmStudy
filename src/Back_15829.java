import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_15829 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int pow = 1;
        int result = 0;
        for (int i = 0; i < L; i++) {
            result += ((str.charAt(i) - 96) * pow);
            pow = (pow * 31) % 1234567891;
        }
        System.out.println(result % 1234567891);
        br.close();
    }
}
