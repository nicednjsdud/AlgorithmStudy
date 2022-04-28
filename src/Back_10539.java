import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_10539 {
    public static void main(String[] args) throws Exception{

        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());            // B의 길이 입력
        int B[]= new int[N];                                // 수열 입력 받을 배열 생성

        // when
        StringTokenizer token = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            B[i]= Integer.parseInt(token.nextToken());     // 수 입력
        }
        // then
        int sum=0;
        int result = 0;
        for(int i=0;i<N;i++){

            result = B[i] * (i+1) - sum;                   // A 수열 구하기
            sum +=result;
            System.out.print(result+" ");
        }
        br.close();

    }
}
