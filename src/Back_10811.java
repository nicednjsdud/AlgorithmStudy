import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_10811 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());        // 바구니 개수 입력
        int M = Integer.parseInt(token.nextToken());        // 역순 만들 횟수
        int arr[] = new int[N];                                        // 바구니 배열
        int K=1;                                        // 바구니
        // when
        for(int i=0;i<N;i++){
            arr[i]=K;
            K++;                                        // 바구니 담기
        }

        for(int k=0;k<M;k++) {
            token = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(token.nextToken());            // i번째 바구니부터
            int j = Integer.parseInt(token.nextToken());            // j번쨰 바구니까지
            for (int m = i - 1; m < j; m++) {
                int temp = 0;
                if (m == j - 1) {                                   // j-i가 짝수일때
                    break;
                }
                if (j - m == 1) {                                   // j-i가 홀수일때
                    break;
                }
                temp = arr[m];
                arr[m] = arr[j-1];
                arr[j - 1] = temp;
                j--;
            }

        }
        // then
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        br.close();
    }

}
