package src;

import java.util.Scanner;

public class Back_5597 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. 입력
        int arr[]=new int[31];
        for(int i=1;i<29;i++){
            int clear=sc.nextInt();     // 과제 한사람 번호입력
            arr[clear]=1;               // 과제 한번호는 1로 변경
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=1){
                System.out.println(i);  // 과제안한사람 ( 0 ) 출력
            }
        }
        sc.close();
    }
}
