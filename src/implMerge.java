import java.io.BufferedReader;
import java.io.InputStreamReader;

public class implMerge {

    static int n;
    static int arr[];

    static int tmp[];
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = 10;
        arr = new int[1000001];
        tmp = new int[1000001];
        mergeSort(0, n);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSort(int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid + 1, end);
            merge(start, mid, end);
        }
    }

    private static void merge(int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = start;

        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }

        while(i <= mid) {
            tmp[k++] = arr[i++];
        }

        while(j <= end) {
            tmp[k++] = arr[j++];
        }

        for(int l = start; l <= end; l++) {
            arr[l] = tmp[l];
        }
    }
}
