import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_15829 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long pow = 1;
        long result = 0;
        for (int i = 0; i < L; i++) {
            result += ((str.charAt(i) - 96) * pow) % 1234567891;
            pow = (pow * 31) % 1234567891;
        }
        System.out.println(result % 1234567891);
        br.close();
    }
}
