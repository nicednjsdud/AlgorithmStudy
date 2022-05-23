import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_3004 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count_sum = 0;      // 조각 개수
        // when
        for(int i=1;i<=N;i++){
            if( i == 1){
                count_sum +=2;          // 처음 값으로 2셋팅
            }
            else{
                count_sum +=((i/2)+1);  //
            }

        }
        System.out.println(count_sum);
        br.close();
    }

}
