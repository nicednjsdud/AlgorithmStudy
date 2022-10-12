import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_3003 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int chess[] = {1, 1, 2, 2, 2, 8};
        // when
        for (int i = 0; i < 6; i++) {
            int inputCount = Integer.parseInt(token.nextToken());
            if (chess[i] != inputCount) {
                chess[i] = chess[i] - inputCount;
            } else
                chess[i] = 0;
        }
        // then
        for (int i = 0; i < chess.length; i++) {
            System.out.print(chess[i] + " ");
        }
        br.close();
    }
}
