import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Back_2921 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                sum += i;
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
