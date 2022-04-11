package src;

import java.util.Scanner;

/*
     같이 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때,
     이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
 */
public class Back_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //     given
        int max=0;
        int arr[][]=new int[9][9];
        int row=0;
        int col=0;
        //    when
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                arr[i][j] = sc.nextInt();
                if(max<arr[i][j]){
                    max=arr[i][j];
                    row=i+1;
                    col=j+1;
                }
            }
        }
        //    then
        System.out.println(max);
        System.out.println(row+" "+col);
        sc.close();


    }
}
