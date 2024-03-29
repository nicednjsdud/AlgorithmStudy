import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back_2805 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        long max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        Arrays.sort(arr);
        max ++;

        long mid = 0;
        long min = 0;

        while (min < max) {

            mid = (max + min) / 2;

            long length = 0;
            for (int i = 0; i < N; i++) {
                if(arr[i] > mid){
                    length += arr[i] - mid;
                }
            }

            if(length < M){
                // 자른 길이가 자를려고 한 길이보다 작을때
                max = mid;
            }
            else{
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
        br.close();
    }
}
