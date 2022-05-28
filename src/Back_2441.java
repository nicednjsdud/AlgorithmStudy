import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2441 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int star_count = Integer.parseInt(br.readLine());       // 별의 개수
        int k=star_count;                                       
        int temp = 0;                                           // 빈칸 변수
        // when
        for(int i=0;i<star_count;i++){
            for(int l=0;l<temp;l++){
                System.out.print(" ");                          // 빈칸
            }
            for(int j=k;j>0;j--){
                System.out.print("*");                          // 별
            }
            System.out.println();
            k--;
            temp++;
        }
        // then
        br.close();
    }
}
