import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2522 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int temp=N;
        // when
        for(int i=1;i<=N;i++){      // 윗줄
            for(int j=1;j<temp;j++){
                System.out.print(" ");
            }
            for(int j=temp;j<=N;j++){
                System.out.print("*");
            }
            System.out.println();
            temp--;
        }
        temp=N-1;                   // 밑에줄
        for(int i=1;i<=N-1;i++){
            for(int j=temp;j<N;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=temp;j++){
                System.out.print("*");
            }
            System.out.println();
            temp--;
        }
        // then
        br.close();
    }
}
