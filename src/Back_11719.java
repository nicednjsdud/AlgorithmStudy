import java.util.Scanner;

public class Back_11719 {
    public static void main(String[] args) {

        // given
        Scanner sc = new Scanner(System.in);
        // when
        while(sc.hasNextLine()){
            String input=sc.nextLine();
            System.out.println(input);
        }

        // then
        sc.close();
    }
}
