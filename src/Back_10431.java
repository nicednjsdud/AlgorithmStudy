import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_10431 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int testNum = Integer.parseInt(st.nextToken());
            int[] arr = new int[20];
            sb.append(testNum).append(" ");
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < i; k++) {
                    if (arr[k] > arr[j]) {
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
