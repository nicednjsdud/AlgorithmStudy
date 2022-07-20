import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Back_11005 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        long N = Long.parseLong(token.nextToken());
        int B = Integer.parseInt(token.nextToken());
        List<Character> list = new ArrayList<>();
        // when
        while (N > 0) {
            if (N % B < 10) {
                list.add((char) (N % B + '0'));
            } else {
                list.add((char) (N % B - 10 + 'A'));
            }
            N /= B;
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i));
        }
        br.close();

        // then
    }
}
