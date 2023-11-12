import java.io.BufferedReader;
import java.util.Scanner;

public class Back_5586 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int joiCount = 0;
        int ioiCount = 0;
        if(str.length() >= 3){
            for (int i = 0; i < str.length() - 2; i++) {
                if(str.charAt(i) == 'I'){
                    if(str.charAt(i+1) == 'O' && str.charAt(i + 2) == 'I'){
                        ioiCount ++;
                    }
                }
                if(str.charAt(i) == 'J'){
                    if(str.charAt(i+1) == 'O' && str.charAt(i + 2) == 'I'){
                        joiCount ++;
                    }
                }
            }
        }
        System.out.println(joiCount);
        System.out.println(ioiCount);
        sc.close();
    }
}
