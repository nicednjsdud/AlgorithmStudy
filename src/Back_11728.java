import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_11728 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr1 = new int[N];
        int[] arr2 = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        int aIdx = 0;
        int bIdx = 0;
        int[] result = new int[N + M];
        for (int i = 0; i < N + M; i++) {
           if(aIdx == N || arr1[aIdx] > arr2[bIdx]) {
               result[i] = arr2[bIdx];
               bIdx++;
           } else {
               result[i] = arr1[aIdx];
               aIdx++;
           }
        }
        for (int i = 0; i < N + M; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
