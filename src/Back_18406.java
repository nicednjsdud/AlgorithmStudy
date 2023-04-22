import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_18406 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int length = str.length();
        int front_check = 0;
        int back_check = 0;
        for (int i = 0; i < length / 2; i++) {

            int first = Integer.parseInt(String.valueOf(str.charAt(i)));
            int second = Integer.parseInt(String.valueOf(str.charAt(i + (length / 2))));

            front_check += first;
            back_check += second;
        }

        if (front_check == back_check) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
        br.close();

    }
}
