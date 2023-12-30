import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_11966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N % 2 == 0){
            while(N % 2 == 0){
                N /= 2;
            }
            if(N == 1){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
        else{
            System.out.println("0");
        }
        br.close();
    }
}
