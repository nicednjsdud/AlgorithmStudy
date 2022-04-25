import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_10409 {
    public static void main(String[] args) throws Exception{
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(token.nextToken());    // 테스트 개수 입력 받기
        int T = Integer.parseInt(token.nextToken());    // 시간 입력받기
        int arr[] =new int[n];                          // n개의 입력시간 받기
        int sum=0;
        int count=0;
        //when
        token = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }
        //then
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>T){
                break;
            }
            count++;

        }
        System.out.println(count);
        br.close();
    }
}
