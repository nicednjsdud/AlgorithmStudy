import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_20361 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int cup_count = Integer.parseInt(token.nextToken());       // 컵 갯수
        int first_position = Integer.parseInt(token.nextToken());  // 첫번째 공 위치
        int test_count = Integer.parseInt(token.nextToken());      // 테스트 카운트
        int temp =first_position;
        // when
        for(int i=0;i<test_count;i++){
            token = new StringTokenizer(br.readLine());
            int change_first = Integer.parseInt(token.nextToken()); // 첫번째 컵
            int change_last = Integer.parseInt(token.nextToken());  // 두번째 컵
            if(temp==change_first){
                temp=change_last;           // 공에위치랑 입력 받은 위치가 같다면
            }
            else if(temp==change_last){
                temp=change_first;
            }

        }
        // then
        System.out.println(temp);
        br.close();
    }
}
