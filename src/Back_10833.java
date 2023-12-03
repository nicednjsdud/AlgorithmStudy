import java.util.Scanner;

public class Back_10833 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int c = sc.nextInt();
            int apple = sc.nextInt();
            sum += apple % c;
        }
        System.out.println(sum);
    }
}
