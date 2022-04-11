

import java.util.Arrays;
import java.util.Scanner;

public class Back_2822 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[]=new int[8];
        int arr2[]=new int[5];
        int arr3[]=new int[8];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            arr3[i]=arr[i];
        }
        Arrays.sort(arr);
        int sum=0;
        for(int i=3;i<arr.length;i++){
            arr2[i-3]=arr[i];
            sum+=arr2[i-3];
        }
        System.out.println(sum);
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr3[i]==arr2[j]){
                    System.out.print((i+1)+" ");
                }
            }
        }
        System.out.println();
        sc.close();
    }
}
