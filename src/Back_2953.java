package src;

import java.util.Scanner;

public class Back_2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        int num=0;
        int max=0;
        // 배열로 담기
        int arr[][]=new int[5][4];
        for(int i=0;i<5;i++){
            int sum=0;
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }
            if(max<sum){
                max=sum;
                num=i+1;
            }
        }
        System.out.println(num+" "+max);
        sc.close();


    }
}
