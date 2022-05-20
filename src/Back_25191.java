import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_25191 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int chicken =Integer.parseInt(br.readLine()); // 치킨 개수

        StringTokenizer token = new StringTokenizer(br.readLine());
        int coke = Integer.parseInt(token.nextToken());
        int beer = Integer.parseInt(token.nextToken());
        // when
        int sum = (coke/2)+beer;
        // then
        if(chicken>sum){
            System.out.println(sum);
        }
        else{
            System.out.println(chicken);
        }


        br.close();
    }
}
