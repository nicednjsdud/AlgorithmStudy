import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long S = Long.parseLong(br.readLine());
        Long sum = 0L;
        Long count = 0L;
        for (Long i = 1L; ; i++) {
            if(sum > S){
                break;
            }
            else{
                sum += i;
                count ++;
            }
        }
        System.out.println(count - 1);
        br.close();
    }
}
