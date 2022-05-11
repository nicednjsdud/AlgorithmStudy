import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_14645 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());        // 종착역 제외한 정거장의 수
        int K = Integer.parseInt(token.nextToken());        // 출발역에서 탑승하는 사람 수
        // when
        
        for(int i=0;i<N;i++){
            token= new StringTokenizer(br.readLine());
            int A = Integer.parseInt(token.nextToken());    // 탑승하는 인원 A
            int B = Integer.parseInt(token.nextToken());    // 탑승하는 인원 B
        }
        // then
        System.out.println("비와이");
    }
}
