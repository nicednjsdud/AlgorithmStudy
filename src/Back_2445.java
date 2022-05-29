import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2445 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int temp=N;
        // when
        // 위의 별
        for(int i=1;i<=N;i++){      // 5번
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<temp-1;j++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
            temp--;
        }
        // 밑의 별
        temp=N;
        for(int i=1;i<N;i++){       // 4번
            for(int j=0;j<temp-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<temp-1;j++){
                System.out.print("*");
            }
            System.out.println();
            temp--;
        }

        // then
        br.close();
    }
}
