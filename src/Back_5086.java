import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int first_num = Integer.parseInt(st.nextToken());
            int second_num = Integer.parseInt(st.nextToken());

            if (first_num == 0 && second_num == 0) {
                break;
            } else {
                if (first_num < second_num) {
                    if (second_num % first_num == 0) {
                        System.out.println("factor");
                    } else {
                        System.out.println("neither");
                    }
                } else if (first_num > second_num) {
                    if (first_num % second_num == 0) {
                        System.out.println("multiple");
                    }
                    else{
                        System.out.println("neither");
                    }
                }
            }
        }
        br.close();
    }
}
