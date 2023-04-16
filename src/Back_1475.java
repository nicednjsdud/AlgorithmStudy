import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1475 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            int num = Character.getNumericValue(str.charAt(i));
            if (num == 6) {
                arr[9]++;
            } else {
                arr[num]++;
            }
        }
        int max = 0;
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, arr[i]);
        }
        int nine_value = arr[9] / 2;
        if (arr[9] % 2 == 1) nine_value++;
        max = Math.max(max, nine_value);
        System.out.println(max);
        br.close();
    }
}
