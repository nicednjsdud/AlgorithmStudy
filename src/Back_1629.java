import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st.nextToken());

        System.out.println(pow(A, B, C));

    }

    private static int pow(long a, long b, long c) {
        if( b == 1 ) return (int) (a % c);
        long val = pow(a, b / 2, c);
        System.out.println(val);
        if( b % 2 == 0) return (int) ((val * val) % c);
        else return (int) (((val * val) % c) * a % c);
    }
}
