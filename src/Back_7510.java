import java.util.Arrays;
import java.util.Scanner;

public class Back_7510 {
    public static void main(String[] args) {

        // 1. given
        Scanner sc = new Scanner(System.in);
        int test_count=sc.nextInt();
        int arr[]=new int [3];          // 삼각형
        for(int i=0;i<test_count;i++){
            for(int j=0;j<3;j++){       // 변 3개입력
              arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);           // 오름차순 정렬로 빗변 찾기
            
            // 직각 삼각형 검사
            if((arr[2]*arr[2])==(arr[1]*arr[1])+(arr[0]*arr[0])){ 
                System.out.println("Scenario #"+(i+1)+":");
                System.out.println("yes");
            }
            else{
                System.out.println("Scenario #"+(i+1)+":");
                System.out.println("no");
            }
            System.out.println();
        }
        sc.close();
    }
}
