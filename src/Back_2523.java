import java.util.Scanner;

public class Back_2523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        boolean check = true;
        for (int i = 1; i <= (2 * N - 1); i++) {
            if (count < N && check == true) {
                for (int j = 0; j < count; j++) {
                    System.out.print("*");
                }
                System.out.println();
                count++;
                if(count == N){
                    check = false;
                }
            } else {
                for (int j = 0; j < count; j++) {
                    System.out.print("*");
                }
                System.out.println();
                count --;
            }
        }
        sc.close();
    }
}
