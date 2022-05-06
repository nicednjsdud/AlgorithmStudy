import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_11586 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());        // 마법 거울의 크기
        String str[]=new String[N];                     // 거울 모습
        // when
        for(int i=0;i<N;i++){
            str[i] = br.readLine();                     // 배열에 담기
        }
        // then
        int K = Integer.parseInt(br.readLine());        // 심리상태
        if(K==1){                                       // 그대로 표현
            for(int i=0;i<N;i++){
                System.out.println(str[i]);
            }
        }
        if(K==2){                                       // 좌/우 반전
            for(int i=0;i<N;i++){
                char ch[] = new char[N];       // ch배열생성(뒤부터 담을꺼)
                int num=0;                              // ch역순으로 세기
                for(int j=N-1;j>=0;j--){
                    ch[num]=str[i].charAt(j);
                    num++;
                }
                for(int j=0;j<N;j++){
                    System.out.print(ch[j]);            // 좌/우 반전
                }
                System.out.println();
            }
        }
        if(K==3){                                       // 상/하 반전
            String str2[]=new String[N];                // String 배열 생성
            int num=0;                                  // 배열 역순
            for(int i=N-1;i>=0;i--){
                str2[num]=str[i];
                num++;
            }
            for(int i=0;i<N;i++){
                System.out.println(str2[i]);
            }
        }
        br.close();
    }
}
