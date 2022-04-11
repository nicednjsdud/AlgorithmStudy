/*
    첫째 줄에 FBI 요원을 출력한다. 이때,
    해당하는 요원이 몇 번째 입력인지를 공백으로 구분하여 출력해야 하며,
    오름차순으로 출력해야 한다. 만약 FBI 요원이 없다면 "HE GOT AWAY!"를 출력한다
 */

import java.util.Scanner;

public class Back_2857 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        String str[]=new String[5];
        for(int i=0;i<5;i++){
            str[i]=sc.nextLine();
            if(str[i].contains("FBI")){
                count++;
                System.out.print((i+1)+" ");
            }
        }
        if(count==0){
            System.out.println("HE GOT AWAY!");
        }
        sc.close();
    }
}
