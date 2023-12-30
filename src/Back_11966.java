import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_11966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long N = Long.parseLong(br.readLine());
        if(N == 1){
            System.out.println(1);
            return;
        }
        while(N!=1){
            if(N%2==1){
                System.out.println(0);
                return;
            }
            N /= 2;
            System.out.println(1);
        }

        br.close();
    }
}
