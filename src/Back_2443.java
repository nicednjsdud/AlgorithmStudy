import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2443 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int back = N * 2 - 1;
        int first = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < back; j++) {
                if(j > first){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            back --;
            first ++;
        }
        br.close();
    }
}
