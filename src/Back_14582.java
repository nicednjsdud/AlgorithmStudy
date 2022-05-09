import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_14582 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[9];                   // 울림 제미니스
        int arr2[]=new int[9];                  // 스타트링크 걸리버스
        // when
        StringTokenizer token = new StringTokenizer(br.readLine());
        for(int i=0;i<9;i++){
            arr[i]=Integer.parseInt(token.nextToken()); // 울림 입력
        }
        token = new StringTokenizer(br.readLine());
        for(int i=0;i<9;i++){
            arr2[i]=Integer.parseInt(token.nextToken());    // 스타트링크 입력
        }
        int sum=0;                                      // 울림 총점
        int sum2=0;                                     // 스타트링크 총점
        for(int i=0;i<9;i++){
            
            sum=arr[i]+sum;
            if(sum>sum2){                           // 울림이 한번이라도 이기고 있다면
                System.out.println("Yes");
                return;
            }
            sum2=arr2[i]+sum2;
        }
        System.out.println("No");
    }
}
