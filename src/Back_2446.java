import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2446 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());        // 입력
        int Test_count = N*2-1;
        int temp =1;
        int star_temp =1;
        String str = " ";
        // when
        for(int i=1;i<=N;i++){              // 윗줄
            for(int j = 1;j<i;j++){
                System.out.print(str);
            }
            for(int j = star_temp;j<=Test_count;j++){
                System.out.print("*");
            }
            System.out.println();
            star_temp=star_temp+2;
        }
        star_temp=3;                // 밑에줄은 4개만 출력하면 되므로 별 1을 생략
        temp=2;
        for(int i=1;i<=N-1;i++){
            for(int j=temp;j<N;j++){
                System.out.print(str);
            }
            for(int j=1;j<=star_temp;j++){
                System.out.print("*");
            }
            System.out.println();
            star_temp=star_temp+2;
            temp++;
        }
        // then
        br.close();
    }
}
