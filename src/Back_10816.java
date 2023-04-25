import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Back_10816 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int check = sc.nextInt();
            sb.append((lowerBinarySearch(arr, check) - upperBinarySearch(arr, check))).append(" ");
        }
        System.out.println(sb);
        sc.close();
    }

    private static int upperBinarySearch(int[] arr, int check) {
        int start = 0;
        int mid = 0;
        int end = arr.length;
        while (start < end) {
            mid = (end + start) / 2;
            if (arr[mid] >= check) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private static int lowerBinarySearch(int[] arr, int check) {
        int start = 0;
        int mid = 0;
        int end = arr.length;
        while (start < end) {
            mid = (end + start) / 2;
            if (arr[mid] > check) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
