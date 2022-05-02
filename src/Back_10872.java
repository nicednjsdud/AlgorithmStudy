import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10872 {
    public static void main(String[] args) throws IOException {


        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());                // 정수 입력
        int result=1;
        int factorial=N;
        // when
        if(N==0){
            N=1;                                                // factorial 0은 1이다.
        }
        for(int i=0;i<N;i++){
            if(factorial==0) {
                break;
            }
            result *= factorial;
            factorial--;

        }
        // then
        System.out.println(result);
    }
}
