import java.util.Scanner;
/*
    빗변은 가장 커야한다.
    a= 높이 b= 밑변 c= 밑변
 */
public class Back_6322 {
    public static void main(String[] args) {
        
        // 입력
        Scanner sc = new Scanner(System.in);
        int i=1;
        while(true){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            if( a==0 && b==0 && c==0){  // 입력3개 0이면 종료
                break;
            }
            // 조건에 따라 변하지 않음
            System.out.println("Triangle #"+i);
            if(a==-1){
                if(c <= b) {
                    System.out.println("Impossible.");
                }
                else {
                    a = Math.sqrt((c * c) - (b * b));
                    System.out.printf("a = %.3f\n", a);
                }
            }
            else if(b==-1){
                if(c <= a) {
                    System.out.println("Impossible.");
                }
                else {
                    b = Math.sqrt((c * c) - (a * a));
                    System.out.printf("b = %.3f\n", b);
                }
            }
            else if(c==-1){

                c=Math.sqrt((a*a)+(b*b));
                System.out.printf("c = %.3f\n",c);
            }
            i++;
            System.out.println();
        }
        sc.close();
    }
}
