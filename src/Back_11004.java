import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Back_11004 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int Test_count = Integer.parseInt(token.nextToken());
        int Counting_num = Integer.parseInt(token.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();
        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < Test_count; i++) {
            arr.add(Integer.parseInt(token.nextToken()));
        }
        // when
        // 오름차순 정렬
        Collections.sort(arr);

        // then
        System.out.println(arr.get(Counting_num-1));
    }
}
