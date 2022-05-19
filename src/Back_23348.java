import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_23348 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int one_hand = Integer.parseInt(token.nextToken()); // 한손코딩
        int no_look =Integer.parseInt(token.nextToken());   // 노룩코딩
        int phone = Integer.parseInt(token.nextToken());    // 폰코딩
        int team_count = Integer.parseInt(br.readLine());   // 동아리수
        int temp=0;
        // when
        for(int i=0;i<team_count;i++){
            int sum=0;                                      // 총점 비교
            for(int j=0;j<3;j++){
                token= new StringTokenizer(br.readLine());
                int first = Integer.parseInt(token.nextToken());
                int second = Integer.parseInt(token.nextToken());
                int third = Integer.parseInt(token.nextToken());
                sum += (first*one_hand)+(second*no_look)+(third*phone); // 동아리마다 총점계산
            }
            if(sum>=temp){
                temp = sum;                                 // 변수에 총점담기
            }
        }
        //then
        System.out.println(temp);
        br.close();
    }
}
