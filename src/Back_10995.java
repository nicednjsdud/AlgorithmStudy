import java.util.Scanner;

public class Back_10995 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sb.append(" ");
            }
            for (int j = 1; j <= N; j++) {
                if (j == N) {
                    sb.append("*");
                }
                else{
                    sb.append("* ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}
