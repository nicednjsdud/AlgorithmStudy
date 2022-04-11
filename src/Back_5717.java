

import java.util.Scanner;

public class Back_5717 {
    public static void main(String[] args) {

        // 입력
        Scanner sc = new Scanner(System.in);

        while(true){
            int boy=sc.nextInt();
            int girl= sc.nextInt();
            if(boy==0 && girl==0){
                break;
            }
            int sum=boy+girl;
            System.out.println(sum);
        }
    }
}
