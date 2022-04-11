package src;

import java.util.Scanner;

public class Back_4470 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        String str[]=new String[num];
        for(int i=0;i<num;i++){
            str[i]=sc.nextLine();
        }
        for(int i=0;i<num;i++){
            System.out.println((i+1)+". "+str[i]);
        }
    }
}
