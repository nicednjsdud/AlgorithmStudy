import java.io.*;
import java.util.StringTokenizer;

public class Back_1850 {

    public static long GCD(long num1, long num2) {
        while (num2 > 0) {
            long temp = num1;
            num1 = num2;
            num2 = temp % num2;
        }
        return num1;
    }

    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer token=new StringTokenizer(br.readLine());
        long num1 = Long.parseLong(token.nextToken());
        long num2 = Long.parseLong(token.nextToken());
        // when
        long gcd = GCD(Math.max(num1,num2),Math.min(num1,num2));
        for(int i=0;i<gcd;i++){
            sb.append("1");
        }
        // then
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
