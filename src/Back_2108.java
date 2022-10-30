import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Back_2108 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_count = Integer.parseInt(br.readLine());
        int arr[] = new int[test_count];
        int mode[][] = new int[test_count][test_count];
        int sum = 0;
        double avg = 0.0;
        int size = 0;
        for (int i = 0; i < test_count; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        // when
        Arrays.sort(arr);
        avg = Math.round(sum / 5);
        size = arr[test_count] - arr[0];
        for (int i = 0; i < test_count; i++) {
            for(int j=0;j<test_count;j++){
                // 같은 수가 있다면
                if(arr[i] == arr[j]){
                    mode[i][j] = arr[i];
                }
            }
        }
        for (int i = 0; i < test_count; i++) {
            for(int j=0;j<test_count;j++){
                if(arr[i] == arr[j]){
                    mode[i][j] = arr[i];
                }
            }
        }
        // then
        // 산술 평균
        System.out.println((int) avg);
        // 중앙 값
        System.out.println(arr[(test_count - 1 / 2)]);
        // 최빈 값

        // 범위
        System.out.println(size);
    }
}
