import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            String[] tempStr = str.split(" ");
            int sum = 0;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < 7; j++) {
                int num = Integer.parseInt(tempStr[j]);
                if(num % 2 == 0){
                    sum += num;
                    if(num < min){
                        min = num;
                    }
                }
            }
            System.out.println(sum + " " + min);
        }
        br.close();
    }
}
