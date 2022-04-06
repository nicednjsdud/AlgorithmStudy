import java.util.Scanner;

public class Back_5063 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Test=sc.nextInt();                  // 테스트 케이스 입력
        int arr[][] = new int [Test][3];        // 정수 3개 입력 받을 배열 생성
        for(int i=0;i<Test;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();         // 정수 3개 입력
            }
        }
        for(int i=0;i<Test;i++){
                if(arr[i][0]<(arr[i][1]-arr[i][2])){
                    System.out.println("advertise");
                }
                else if(arr[i][0]>(arr[i][1]-arr[i][2])){
                    System.out.println("do not advertise");
                }
                else if(arr[i][0]==(arr[i][1]-arr[i][2])){
                    System.out.println("does not matter");
                }

        }

        sc.close();

    }
}
