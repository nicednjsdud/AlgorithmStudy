import java.util.Arrays;
import java.util.Scanner;

public class Back_9076 {
    public static void main(String[] args) {

        // given
        Scanner sc = new Scanner(System.in);
        int test_count = sc.nextInt();      //테스트 개수
        int arr[]=new int[5];               // 점수배열
        for(int i=0;i<test_count;i++){
            for(int j=0;j<5;j++){           // 점수 입력받기
                arr[j]=sc.nextInt();
            }
        // when
            Arrays.sort(arr);               // 배열 오름차순 정렬
            if(arr[3]-arr[1]>=4){           // 4점 이상 차이나면
                System.out.println("KIN");
            }
            else if(arr[3]-arr[1]<4){
                int sum=arr[1]+arr[2]+arr[3];   // 가운의 3개의 합
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
