import java.io.IOException;
import java.util.Scanner;

public class Back_5596 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int score1 = 0;
        int score2 = 0;
        int S = 0, S2 = 0;

        for(int i=0; i<4; i++) {
            score1 = sc.nextInt();
            S += score1;
        }

        for(int i=0; i<4; i++) {
            score2 = sc.nextInt();
            S2 += score2;
        }

        if(S >= S2) {
            System.out.println(S);
        }else if(S < S2) {
            System.out.println(S2);
        }


    }
}
