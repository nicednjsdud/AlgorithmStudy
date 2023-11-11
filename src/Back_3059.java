import java.util.Scanner;

public class Back_3059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String str = sc.next();
            int sum = 0;
            boolean[] check = new boolean[26];

            for (int j = 0; j < str.length(); j++) {
                check[str.charAt(j) - 'A'] = true;
            }
            for (int j = 0; j < 26; j++) {
                if(!check[j]) sum += (j + 'A');
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
