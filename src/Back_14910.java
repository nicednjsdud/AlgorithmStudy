import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_14910 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Narr[]=new int[1000000];                // 정수 담을 배열
        int i=1;                                    // 배열 카운트
        int badcount=0;
        StringTokenizer token = new StringTokenizer(br.readLine());
        Narr[0]=Integer.parseInt(token.nextToken());    // 첫번째 먼저담기
        // when
        while(token.hasMoreTokens()){
            Narr[i]=Integer.parseInt(token.nextToken());
            if(Narr[i]<Narr[i-1]){
                badcount++;
            }
            i++;
        }
        // then
        if(badcount>0){
            System.out.println("Bad");
        }
        else{
            System.out.println("Good");
        }
        br.close();
    }
}
