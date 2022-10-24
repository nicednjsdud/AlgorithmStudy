import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_10807 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[test_count];
        // when
        for(int i=0;i<test_count;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int search= Integer.parseInt(br.readLine());
        int count = 0;
        for (int i : arr) {
            if(i == search){
                count++;
            }
        }
        // then
        br.close();
        System.out.println(count);
    }
}
