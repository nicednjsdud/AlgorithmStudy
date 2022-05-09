import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_13225 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C =Integer.parseInt(br.readLine());         // 테스트 갯수

        // when
        for(int i=1;i<=C;i++){
            int n =Integer.parseInt(br.readLine());     // 수입력
            int count=0;                                // 갯수세기
            for(int j=1;j<=n;j++){                       // 공약수 찾기
                if(n%j==0){
                    count++;
                }
            }
            // then
            System.out.println(n+" "+count);

        }
        br.close();


    }
}
