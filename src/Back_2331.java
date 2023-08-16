import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Back_2331 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(A);

        while (true) {
            int num = arr.get(arr.size() - 1);
            int result = 0;
            while (num != 0) {
                result += (int) Math.pow(num % 10, P);
                num /= 10;
            }

            if(arr.contains(result)){
                int ans = arr.indexOf(result);
                System.out.println(ans);
                break;
            }
            arr.add(result);
        }
        br.close();
    }
}
