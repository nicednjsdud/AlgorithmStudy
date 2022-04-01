import java.util.Scanner;

public class Back_5032 {
    public static void main(String[] args) {
        /*
            9개에서
            3개로 한병 바꿔 그럼 6+1 =7
            3개로 한병 바꿔 그럼 4+1 =5
            ...
         */

        Scanner sc = new Scanner(System.in);

        int have_bottle =sc.nextInt();
        int today_bottle =sc.nextInt();
        int change_bottle= sc.nextInt();
        int current_bottle=have_bottle+today_bottle;
        int count=0;
        while(current_bottle>=change_bottle){
            current_bottle-=change_bottle;
            current_bottle++;
            count++;

        }
        System.out.println(count);
        sc.close();
    }
}
