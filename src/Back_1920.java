import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Back_1920 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int M = sc.nextInt();
        int[] check = new int[M];
        for (int i = 0; i < M; i++) {
            check[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            System.out.println(binarySearch(arr, check[i]));
        }
    }

    private static int binarySearch(int[] arr, int check) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == check) return 1;
            else if (arr[mid] > check) high = mid - 1;
            else if (arr[mid] < check) low = mid + 1;
        }
        return 0;
    }
}
