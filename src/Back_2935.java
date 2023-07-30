import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Back_2935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger A = new BigInteger(br.readLine());
        String str = br.readLine();
        BigInteger B = new BigInteger(br.readLine());

        if (str.equals("*")) {
            System.out.println(A.multiply(B));
        } else {
            System.out.println(A.add(B));
        }
        br.close();
    }
}
