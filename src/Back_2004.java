import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_2004 {

    public static void main(String[] args) throws IOException {


        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());
        // when
        long cnt2 = count2(N) - count2(M) - count2(N-M);
        long cnt5 = count5(N) - count5(M) - count5(N-M);
        // then
        br.close();
        System.out.println(Math.min(cnt2,cnt5));

    }

    private static long count5(int n) {
        long temp =0;
        if(n<5)
            return 0;
        while(n>=5){
            temp += n/5;
            n/=5;
        }
        return temp;

    }

    private static long count2(int n) {
        long temp =0;
        if(n<2)
            return 0;
        while(n>=2){
            temp += n/2;
            n/=2;
        }
        return temp;
    }
}