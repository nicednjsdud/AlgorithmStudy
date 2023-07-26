import java.io.BufferedReader;
import java.util.Scanner;

public class Back_5355 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            double num = Double.parseDouble(arr[0]);
            for (int j = 1; j < arr.length; j++) {
                if (arr[j].equals("@")) num *= 3;
                else if (arr[j].equals("%")) num += 5;
                else if (arr[j].equals("#")) num -= 7;
            }
            sb.append(String.format("%.2f", num)).append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}
