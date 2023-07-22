import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10162 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int first = 0;
        int second = 0;
        int third = 0;
        if(T % 10 == 0){
            while(true){
                if(T < 300){
                    break;
                }
                T = T - 300;
                first++;
            }
            while(true){
                if(T < 60){
                    break;
                }
                T = T - 60;
                second++;
            }
            third = T / 10;

            System.out.println(first + " " + second + " " + third);
        }
        else{
            System.out.println(-1);
        }
        br.close();
    }
}
