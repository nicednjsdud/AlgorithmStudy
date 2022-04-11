

import java.util.Scanner;

public class Back_5988 {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int test_count=sc.nextInt();        // 테스트개수

        for(int i=0;i<test_count;i++){
            int num=sc.nextInt();           // 번호입력
            if(num%2==0){
                System.out.println("even"); //짝수이면 even
            }
            else{
                System.out.println("odd");  // 홀수이면 odd
            }
        }
        sc.close();
    }
}
