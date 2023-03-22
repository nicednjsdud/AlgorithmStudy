import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1515 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int pointer = 0;
        int ten_pointer = 0;

        for (int i = 0; i < str.length(); i++) {

            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            if (str.length() - 1 > i) {
                if (pointer >= num) {
                    pointer = 0;
                    ten_pointer++;
                } else {
                    pointer = num - pointer;
                }
            } else {
                num = num + (ten_pointer * 10);
                System.out.println(num);
            }
        }
        br.close();
    }
}
