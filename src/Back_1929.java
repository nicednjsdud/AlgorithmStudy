import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Back_1929 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(token.nextToken());
        int N = Integer.parseInt(token.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=M;i<=N;i++){
            if (i % 2 != 0) {
                for (int j = 2; j <= i; j++) {
                    if (j == i) {
                        list.add(i);
                    }
                    if (i % j == 0) {
                        break;
                    }
                }
            }

        }
        // then
        br.close();
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
