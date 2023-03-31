import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2747 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int n1 = 0;
        int n2 = 0;
        int temp_1 = 0;
        int temp_2 = 0;

        for(int i = 0 ;i< n;i++){
            if(i == 0 || i == 1){
                n1 = 1;
                n2 = 1;
            }
            else{
                temp_1 = n1;
                temp_2 = n2;
                n1 = temp_2;
                n2 = temp_1 + temp_2;
            }
        }
        System.out.println(n2);
        br.close();
    }
}
