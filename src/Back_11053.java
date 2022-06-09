import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_11053 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int arr[]=new int[n];       // 수열 A(i)
        int seq[]=new int[n];       // 수열 배열 생성
        StringTokenizer token=new StringTokenizer(br.readLine());
        // when
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(token.nextToken()); // 입력
        }
        seq[0]=1;
        for(int i=1;i<n;i++){
            seq[i]=1;   // 1로 초기화
            for(int j=0;j<i;j++){

                if(arr[j]<arr[i]&&seq[i]<=seq[j]){ // ex) 1번째보다 2번째가 더크고
                    seq[i]=seq[j]+1;                // 수열 2번째보다 1번째가 더크거나같을때
                }
            }
        }
        // then
        int max=0;
        for(int i : seq){
            max=Math.max(max,i);
        }
        System.out.println(max);
        br.close();
    }
}
