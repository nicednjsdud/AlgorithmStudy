import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_9501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // given
        int T = Integer.parseInt(br.readLine());      // 테스트 카운트 입력
        for(int i=1;i<=T;i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(token.nextToken());   // 우주선 갯수 입력
            double D = Double.parseDouble(token.nextToken()); // 거리입력
            int count =0;      // 체크 카운트
            for(int j=1;j<=N;j++){
                token = new StringTokenizer(br.readLine());
                double V = Double.parseDouble(token.nextToken()); // 최고속도
                double F = Double.parseDouble(token.nextToken()); // 연료량
                double C = Double.parseDouble(token.nextToken()); // 연료 소비율

                // when
                double arrive = D/V;   // 마지막 까지 가는데 걸리는 시간
                double check = F-(arrive*C);    // 갈수 있는지 없는지 체크
                if(check>=0){
                    count++;
                }
            }
            //then
            System.out.println(count);
            
        }
    }
}
