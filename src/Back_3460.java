import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            // binary number
            String binary = Integer.toBinaryString(N);
            binary = new StringBuilder(binary).reverse().toString();
            for(int j = 0; j < binary.length(); j++){
                if(binary.charAt(j) == '1'){
                    System.out.print(j + " ");
                }
            }
        }
    }
}
