import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back_4153 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int arr[] = new int[3];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }
            Arrays.sort(arr);
            if ((arr[0] * arr[0]) + (arr[1] * arr[1]) == arr[2] * arr[2]) {
                sb.append("right").append("\n");
            }
            else{
                sb.append("wrong").append("\n");
            }

        }
        System.out.println(sb);
        br.close();
    }
}
