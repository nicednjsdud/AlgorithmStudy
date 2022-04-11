package src;
/*
    7개의 자연수가 주어질 때, 이들 중 홀수인 자연수들을 모두 골라 그 합을 구하고,
    고른 홀수들 중 최솟값을 찾는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Back_2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // given
        int min=100;
        int sum=0;
        int count=0;
        // when
        for(int i=0;i<7;i++){
            int number=sc.nextInt();
            if(number%2!=0){
                count++;
                sum+=number;
                if(number<min){
                    min=number;
                }
            }

        }
        sc.close();
        // then
        if(count==0){
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
