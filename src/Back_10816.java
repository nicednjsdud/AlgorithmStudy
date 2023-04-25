import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back_10816 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        int check[] = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            check[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            System.out.println(binarySearch(arr, check[i]));
        }
    }

    private static int binarySearch(int[] arr, int check) {
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;
        int count = 0;
        while (start <= end) {
            mid = (end + start) / 2;
            if (arr[mid] == check){
                count ++;

            }
            else if(arr[mid] > check) end = mid -1;
            else if(arr[mid] <)

        }

        return 0;
    }
}
