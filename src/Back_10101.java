import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10101 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // given
        int A = Integer.parseInt(br.readLine());    // 각1
        int B = Integer.parseInt(br.readLine());    // 각2
        int C = Integer.parseInt(br.readLine());    // 각3

        // when
        if(A+B+C==180){                             // 세각의 크기가 180이면
            if(A==B && B==C){                       // 1. 세각의 크기가 같으면
                System.out.println("Equilateral");
            }
            else if(A==B || A==C || B==C){          // 2. 두각이 같은 경우
                System.out.println("Isosceles");
            }
            else{
                System.out.println("Scalene");      // 3. 각은 각이 없는경우
            }

        }
        else{
            System.out.println("Error");            // 세각의 합이 180이 아니면
        }
        br.close();
    }
}
