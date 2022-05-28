import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2440 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int star_count = Integer.parseInt(br.readLine());       // 별의 개수
        int k = star_count;                                     // k변수 생성
        // when
        for(int i=0;i<star_count;i++){
            for(int j=k;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
            k--;                                            // k를 하나씩 줄여준다.
        }
        // then
        br.close();


    }
}
