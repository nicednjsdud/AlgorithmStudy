import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_9610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q1 = 0, q2 = 0, q3 = 0, q4 = 0, axis = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            if (x == 0 || y == 0) {
                axis++;
            } else if (x > 0 && y > 0) {
                q1++;
            } else if (x < 0 && y > 0) {
                q2++;
            } else if (x < 0 && y < 0) {
                q3++;
            } else if (x > 0 && y < 0) {
                q4++;
            }
        }
        System.out.println("Q1: " + q1);
        System.out.println("Q2: " + q2);
        System.out.println("Q3: " + q3);
        System.out.println("Q4: " + q4);
        System.out.println("AXIS: " + axis);
    }
}
