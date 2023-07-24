import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10988 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());

        boolean check = sb.toString().equals(sb.reverse().toString());
        if(check){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        br.close();
    }
}
