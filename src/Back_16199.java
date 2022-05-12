import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_16199 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token= new StringTokenizer(br.readLine());
        int year = Integer.parseInt(token.nextToken()); // 년 입력
        int month = Integer.parseInt(token.nextToken()); // 달 입력
        int day = Integer.parseInt(token.nextToken());  // 일 입력
        token= new StringTokenizer(br.readLine());
        int year2 = Integer.parseInt(token.nextToken()); // 년 입력
        int month2 = Integer.parseInt(token.nextToken()); // 달 입력
        int day2 = Integer.parseInt(token.nextToken());  // 일 입력

        // when
        int y3 = year2- year;           // 연 나이
        if(year<year2){                // 만나이
            if(month>month2){
                System.out.println(Math.abs(y3-1));
            }
            else if(month==month2){
                if(day>day2){
                    System.out.println(y3-1);
                }
                else {
                    System.out.println(y3);
                }
            }
            else{
                System.out.println(y3);
            }
        }
        else if(year==year2){
            System.out.println(y3);
        }
        // then
        System.out.println(y3+1);       // 세는나이
        System.out.println(y3);         // 연나이

    }
}
