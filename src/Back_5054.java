import java.util.Arrays;
import java.util.Scanner;

public class Back_5054 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test_count=sc.nextInt();            // 테스트 개수 입력
        int arr[][] = new int[test_count][50];    // 상점 거리 받기
        for(int i=0;i<test_count;i++){
            int store_count=sc.nextInt();       // 상점 개수 입력
            for(int j=0;j<store_count;j++){
                arr[i][j]=sc.nextInt();         // 상점 거리 입력
            }
        }
        Arrays.sort(arr);                       // 오른 차순 정렬
        int count =0;
        for(int i=0;i<test_count;i++){
            for(int j=0;j<arr[i].length;j++){
                 count = (arr[i][arr[i].length-1]-arr[i][0])/2;
            }
            System.out.println(count);
        }
    }
}
