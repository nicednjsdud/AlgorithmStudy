import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Back_5176 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int P = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] arr = new int[P];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = 1;
            }
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                int
                if (arr[j] == 1) {
                    arr[j] = 0;
                }
                else{
                    count ++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
