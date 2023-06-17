import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        System.out.println(Rev(Rev(X) + Rev(Y)));
        br.close();
    }

    public static int Rev(int num) {
        String str = "";
        while (num > 0) {
            str += num % 10;
            num /= 10;
        }
        return Integer.parseInt(str);
    }
}
