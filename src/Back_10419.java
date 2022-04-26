import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Back_10419 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // given
        int T = Integer.parseInt(br.readLine());    // 경우의 수

        int d = 0;                                  // 수업시간 입력
        // then
        for(int i=0;i<T;i++){
            d = Integer.parseInt(br.readLine());
            int t=1;                                    // 최대시간

            while((t*t)+t <= d){                    // 입력 + 지각 <= 최대시간
                t++;
            }
            System.out.println(t-1);
        }

    }
}
