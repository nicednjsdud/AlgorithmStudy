

import java.util.Scanner;

public class Back_4880 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run =true;
        while(run){
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int num3=sc.nextInt();
            if(num1==0&& num2 ==0 && num3==0){
                break;
            }
            if((num3-num2)==(num2-num1)){
                // 등차수열
                int num4= num3+(num3-num2);
                System.out.println("AP "+num4);
            }
            else if((num3/num2)==(num2/num1)){
                // 등비수열
                int num4 = num3*(num2/num1);
                System.out.println("GP "+num4);
            }
        }
    }
}
