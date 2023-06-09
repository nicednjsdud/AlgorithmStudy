import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Back_11931 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Integer arr[] = new Integer[N];
        for(int i = 0; i< N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (Integer integer : arr) {
            bw.write(integer+"\n");
        }
        br.close();
        bw.close();
    }
}
