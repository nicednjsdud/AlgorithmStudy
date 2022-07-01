import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Back_11652 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test_count = Integer.parseInt(br.readLine());    // 테스트 개수 입력
        long arr[] = new long[Test_count];
        for (int i = 0; i < Test_count; i++) {
            arr[i] = Long.parseLong(br.readLine());          // 배열 입력
        }
        // when
        Arrays.sort(arr);                                    // 오름차순 정렬


        int max = 1;                                         // 출력할 수의 최대 카운트
        int num=0;                                           // 출력할 수
        int count = 1;
        for(int i=1;i<Test_count;i++){
            if(arr[i]==arr[i-1]){   // 만약 전의 수가 같으면 count ++
                count++;
            }
            else {
                count = 1;          // 아니면 count = 1 (초기화)
            }

            if(count>max){
                max=count;
                num=i;
            }
        }
        // then
        System.out.println(arr[num]);       // arr[num] 번째의 값 출력
        br.close();

    }
}
