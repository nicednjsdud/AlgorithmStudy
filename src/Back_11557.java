import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Back_11557 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = sc.nextInt();

        while (T > 0) {
            int N = sc.nextInt();
            String best = "";
            int count = 0;
            for (int i = 0; i < N; i++) {
                String S = sc.next();
                int L = sc.nextInt();
                if (L > count) {
                    count = L;
                    best = S;
                }
            }
            sb.append(best).append("\n");
            T--;
        }
        sc.close();
        System.out.println(sb);
    }
}
