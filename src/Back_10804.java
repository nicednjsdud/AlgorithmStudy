import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int arr[] = new int[21];
        arr[0] = 0;
        for (int i = 1; i <= 20; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int num = (Math.abs(start - end) / 2);
            int count = 0;
            for (int j = 0; j < num; j++) {
                int temp = arr[start + count];
                arr[start + count] = arr[end - count];
                arr[end - count] = temp;
                count++;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i] + " ");
            }
        }
        br.close();
    }
}
