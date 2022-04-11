package src;

import java.util.Scanner;

/*N으로 나누었을 때 나머지와 몫이 같은 모든 자연수의 합을 구하는 프로그램을 작성하시오.
  예를 들어 N=3일 때, 나머지와 몫이 모두 같은 자연수는 4와 8 두 개가 있으므로, 그 합은 12이다

 */
public class Back_1834 {
    public static void main(String[] args){
        //1.입력
        Scanner sc=new Scanner(System.in);
        // 1-1. 자연수 N 입력
        long N = sc.nextInt();                 //나머지는 자연수 N을 넘을수 없음.
        long sum=0;                            //몫 이랑 나머지랑 같을려면 N이하여야함
        long num1=0;
        sc.close();
        for(int i=1;i<N;i++){
            num1=(N+1)*i;
            if((num1/N)>=N){
                break;
            }
            if(N==1){
                System.out.println(1);
            }
            sum+=num1;
        }
        System.out.println(sum);
    }
}
