/*
    10^6까지의 입력이 주어지므로 long long 데이터형으로 입력을 받기에도 무리이다.
     따라서 String으로 숫자를 받은 후에 split으로 배열로 만든 뒤,
     가장 마지막 숫자로 홀짝을 판별하도록한다.
 */

import java.util.Scanner;

public class Back_5988 {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int test_count=sc.nextInt();        // 테스트개수

       while(test_count!=0){
           String[] str=sc.next().split("");
           int num = Integer.parseInt(str[str.length-1]);
           if(num%2==0){
               System.out.println("even");
           }
           else{
               System.out.println("odd");
           }
           test_count--;
       }
    }
}
