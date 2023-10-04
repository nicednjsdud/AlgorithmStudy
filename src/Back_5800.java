import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Back_5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            String str = br.readLine();
            String[] tempArr = str.split(" ");
            Integer[] arr = new Integer[Integer.parseInt(tempArr[0])];
            for (int j = 1; j < tempArr.length; j++) {
                arr[j-1] = Integer.parseInt(tempArr[j]);
            }
            Arrays.sort(arr, Collections.reverseOrder());
            int gap = 0;

            for (int j = 1; j < arr.length; j++) {
                int temGap = Math.abs(arr[j] - arr[j-1]);
                if (temGap > gap) {
                    gap = temGap;
                }
            }
            sb.append("Class " + (i + 1)).append("\n");
            sb.append("Max "+ arr[0] + ", Min " + arr[arr.length-1] + ", Largest gap "+ gap).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
