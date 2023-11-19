import java.util.Scanner;

public class Back_5598 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ar = new char[str.length()];

        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)-3 < 'A'){
                ar[i] = (char)(str.charAt(i) + 23);
            }
            else{
                ar[i] = (char)(str.charAt(i) - 3);
            }
        }
        for (char c : ar) {
            System.out.print(c);
        }
        sc.close();
    }
}
