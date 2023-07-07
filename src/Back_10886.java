import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N % 2 != 0) {
           System.exit(0);
        }
        int notCute = 0;
        int cute = 0;

        for (int i = 0; i < N; i++) {
            int person = Integer.parseInt(br.readLine());
            if (person == 1) {
                cute++;
            } else if (person == 0) {
                notCute++;
            }
        }
        if (notCute > cute) {
            System.out.println("Junhee is not cute!");
        } else if (cute > notCute) {
            System.out.println("Junhee is cute!");
        }
        br.close();
    }
}
