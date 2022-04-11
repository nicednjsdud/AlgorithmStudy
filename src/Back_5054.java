package src;

import java.util.Arrays;
import java.util.Scanner;

public class Back_5054 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test_count=sc.nextInt();            // 테스트 개수 입력
        while(test_count!=0){
            int store_count=sc.nextInt();       // 상점 개수 입력
            int sum =0;
            int arr[]=new int[store_count];     // 상점 개수 거리입력
            for(int i=0;i<store_count;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);                   // 오른 차순 정렬

            sum=(arr[arr.length-1]-arr[0])*2;
            System.out.println(sum);
            test_count--;

        }
        sc.close();
    }
}
