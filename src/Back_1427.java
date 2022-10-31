import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Back_1427 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Integer arr[] = new Integer[str.length()];
        // when
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        Arrays.sort(arr, Collections.reverseOrder());
        // then
        for (Integer integer : arr) {
            System.out.print(integer);
        }
        br.close();
    }
}
