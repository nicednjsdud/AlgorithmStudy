import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1924 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int month = Integer.parseInt(token.nextToken());    // 달입력
        int day = Integer.parseInt(token.nextToken());      // 일입력

        int Days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int total =day;
        for(int i=0;i<month-1;i++){         // 전달까지의 일수 합하기
            total +=Days[i];
        }
        System.out.println(week[total%7]);
    }
}
