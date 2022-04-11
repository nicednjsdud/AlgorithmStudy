

import java.util.Scanner;

public class Back_1731 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int arr[]=new int[count];
        int n=0;
            for(int i=0;i<count;i++){
                arr[i]=sc.nextInt();
            }
        for(int i=0;i<arr.length;i++) {

            if ((arr[i + 1] - arr[i]) == (arr[arr.length-1] - arr[arr.length - 2])) {
                //등차수열
                n = arr[arr.length-1] + (arr[i+1] - arr[i]);
                break;
            } else {
                //등비수열
                n = arr[arr.length-1] * (arr[i+1] / arr[i]);
                break;
            }
        }
        System.out.println(n);
        sc.close();



    }
}
