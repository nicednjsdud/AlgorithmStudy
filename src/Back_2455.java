import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_2455 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int station_count = 4;
        int sum =0;
        int max = 0;
        for (int i = 0; i < station_count; i++) {
            st = new StringTokenizer(br.readLine());
            int get_off_count = Integer.parseInt(st.nextToken());
            int ride_count = Integer.parseInt(st.nextToken());

            sum -= get_off_count;
            sum += ride_count;
            if(sum >= max){
                max = sum;
            }
        }
        System.out.println(max);

    }
}
