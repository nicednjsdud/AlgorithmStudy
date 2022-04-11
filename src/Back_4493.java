
import java.util.Scanner;

public class Back_4493 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // given
        
        int test_count =sc.nextInt();
        // when
        for(int i=0;i<test_count;i++){               // 테스트 케이스 개수
            int count=sc.nextInt();                     // 가위 바위보를 한 횟수
            sc.nextLine();
            String str[]=new String[count];
            int P1_count=0;
            int P2_count=0;
            for(int j=0;j<count;j++){
                str[j] =sc.nextLine();
                if(str[j].charAt(0)=='R'){
                    if(str[j].charAt(2)=='P'){
                        P2_count++;
                    }
                    else if(str[j].charAt(2)=='S'){
                        P1_count++;
                    }

                }
                else if(str[j].charAt(0)=='P'){

                    if(str[j].charAt(2)=='S'){
                        P2_count++;
                    }
                    else if(str[j].charAt(2)=='R'){
                        P1_count++;
                    }
                }
                else if(str[j].charAt(0)=='S'){
                    if(str[j].charAt(2)=='P'){
                        P1_count++;
                    }
                    else if(str[j].charAt(2)=='R'){
                        P2_count++;
                    }
                }

            }
            // then
            if(P1_count>P2_count){
                System.out.println("Player 1");
            }
            else if(P1_count<P2_count){
                System.out.println("Player 2");
            }
            else{
                System.out.println("TIE");
            }

        }
    }
}
