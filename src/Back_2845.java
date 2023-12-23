import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_2845 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int people = Integer.parseInt(st.nextToken());
        int area = Integer.parseInt(st.nextToken());
        int arr[] = new int[5];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            int paper_people = Integer.parseInt(st.nextToken());
            arr[i] = paper_people - (people * area);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        br.readLine();
    }
}
