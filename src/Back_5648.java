import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back_5648 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long arr[] = new long[n];

        while (n > 0) {
            while (st.hasMoreTokens()) {
                n--;
                String str = st.nextToken();
                StringBuilder temp = new StringBuilder();
                for (int i = str.length() - 1; i >= 0; i--) {
                    temp.append(str.charAt(i));
                }
                arr[n] = Long.parseLong(temp.toString());
            }

            if (n > 0) st = new StringTokenizer(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        br.close();
    }
}
