import java.util.Scanner;

public class Back_5613 {
    public static void main(String[] args) {
        // given
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();           // 수 입력
        int result=num;                       // 결과 담을 변수
        while(true){
            String clac=sc.next();          // 사칙연산 입력
            if(clac.equals("=")){           // 사직연산이 = 이면 종료
                System.out.println(result);
                break;
            }
            switch (clac){
                case "+":
                    int num1=sc.nextInt();
                    result+=num1;
                    break;
                case "-":
                    int num2=sc.nextInt();
                    result-=num2;
                    break;
                case "*":
                    int num3=sc.nextInt();
                    result*=num3;
                    break;
                case "/":
                    int num4=sc.nextInt();
                    result/=num4;
                    break;
            }

        }
        sc.close();
        

    }
}
