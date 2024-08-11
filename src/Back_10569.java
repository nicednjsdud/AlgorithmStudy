import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10569 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            String[] arr = br.readLine().split(" ");
            int V = Integer.parseInt(arr[0]);
            int E = Integer.parseInt(arr[1]);
            System.out.println(2 - V + E);
        }
    }
}
