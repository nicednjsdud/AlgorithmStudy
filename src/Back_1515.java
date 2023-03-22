import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1515 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int pointer = 0;
        int count = 0;

        while(count++ <= 30000){
            String temp = String.valueOf(count);
            for(int i = 0 ; i< temp.length(); i++){
                if(temp.charAt(i) == str.charAt(pointer)){
                    pointer ++;
                }
                if(pointer == str.length()){
                    System.out.println(count);
                    return;
                }
            }
        }
        br.close();
    }
}
