import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Back_5555 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            s += s;
            if (s.contains(target)) {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
