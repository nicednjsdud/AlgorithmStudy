import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back_16435 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int fruit_count = Integer.parseInt(token.nextToken());  // 과일의 개수
        int snake_length = Integer.parseInt(token.nextToken()); // 스네이크 초기길이
        int height[]= new int[fruit_count];                     // 과일의 높이
        token = new StringTokenizer(br.readLine());
        for(int i=0;i<fruit_count;i++){
            height[i]= Integer.parseInt(token.nextToken());     //배열에 과일높이 대입
        }
        Arrays.sort(height);                                    // 오름차순 정렬
        for(int i=0;i<fruit_count;i++){
            if(height[i]<=snake_length){
                snake_length++;
            }
        }
        // then
        System.out.println(snake_length);
        br.close();
    }
}
