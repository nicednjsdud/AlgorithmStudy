/*
    9개로 3병 바꿔서
    다먹고 하나더
 */

import java.util.Scanner;

public class Back_5032_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int have_bottle =sc.nextInt();
        int today_bottle =sc.nextInt();
        int change_bottle= sc.nextInt();
        int count=have_bottle+today_bottle;
        int temp=0;
        boolean run= true;
        while(run){
            if(count>=change_bottle){
                count=count/change_bottle;
                temp+=count;
            }
            else {
                run=false;
            }

        }
        System.out.println(temp);
        sc.close();
    }
}
