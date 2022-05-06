import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_11721 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();             // 입력받기

        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            if(i%10==9){                        // 10개마다 끊어주기
                System.out.println();
            }
        }
    }
}
