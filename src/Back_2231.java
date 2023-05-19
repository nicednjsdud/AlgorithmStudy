import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2231 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean checkFlag = true;
        for (int i = 0; i < N; i++) {
            String str = i + "";
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                sum += Character.getNumericValue(str.charAt(j));
            }
            if (sum + i == N) {
                System.out.println(i);
                checkFlag = false;
                break;
            }
        }
        if(checkFlag){
            System.out.println(0);
        }
        br.close();
    }
}
