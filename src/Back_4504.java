package src;

import java.util.Scanner;

public class Back_4504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        boolean run =true;
        while(run){
            int multiple_count=sc.nextInt();
            if(multiple_count==0){
                break;
            }
            if(multiple_count%number==0){
                System.out.println(multiple_count+" is a multiple of "+number+".");
            }
            else{
                System.out.println(multiple_count+" is NOT a multiple of "+number+".");
            }

        }
        sc.close();
    }
}
