import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2442 {
    public static void main(String[] args) throws IOException {


        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int star_count = Integer.parseInt(br.readLine());
        // when
        for(int i=1;i<=star_count;i++){
            for(int j=i;j<star_count;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // then
        br.close();
    }
}
