import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Back_2295 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] twoArr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                twoArr[i] = arr[i] + arr[j];
            }
        }
        Arrays.sort(twoArr);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int searchMax = (binarySearch(twoArr, arr[i]));
            if(sum < searchMax){
                sum = searchMax;
            }
        }
        System.out.println(sum);
    }

    private static int binarySearch(int[] twoArr, int num) {
        int start = 0;
        int end = twoArr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (twoArr[mid] == num) return num;
            else if (twoArr[mid] > num) end = mid - 1;
            else if (twoArr[mid] < num) start = mid + 1;
        }
        return 0;
    }
}
