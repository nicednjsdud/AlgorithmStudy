import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10991 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());        // 입력
        int temp=1;                                     // 공백을 한칸씩 지워준다.
        // when
        for(int i=1;i<=N;i++){
          for(int j=temp;j<=N-1;j++){          // 처음 빈칸측정
              System.out.print(" ");
          }

          for(int j=1;j<=((2*i)-1);j++){
              if(j%2 == 1){         // 홀수이면
                  System.out.print("*");
              }
              else{
                  System.out.print(" "); //짝수이면
              }
          }
          System.out.println();
          temp++;
        }
        // then
        br.close();
    }
}
