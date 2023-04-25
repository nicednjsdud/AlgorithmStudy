import java.util.Arrays;
import java.util.Scanner;

public class Back_10815 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);       // 이분탐색은 배열 정렬을 해줘야함
        int M = sc.nextInt();
        int check[] = new int[M];

        for (int i = 0; i < M; i++) {
            check[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {

            System.out.print(binarySearch(arr, check[i]));
        }
    }

    private static String binarySearch(int[] arr, int check) {
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == check) return 1 + " ";
            else if (arr[mid] > check) end = mid - 1;
            else if (arr[mid] < check) start = mid + 1;
        }
        return 0 + " ";
    }
}
