package src;

import java.util.Scanner;

public class Back_4458 {
    public static void main(String[] args) {
        // given
        Scanner sc=new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num=sc.nextInt();
        sc.nextLine();
        // when
        for(int i=0;i<num;i++){
            String temp =sc.nextLine();

            String result=temp.substring(0,1).toUpperCase()+""+temp.substring(1,temp.length());

            sb.append(result+"\n");
        }
        // result
        System.out.println(sb.toString());
        sc.close();
    }
}
