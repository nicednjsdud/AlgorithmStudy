package src;

import java.util.Scanner;

public class Back_5704 {
    public static void main(String[] args) {

        // 1. 입력
        Scanner sc = new Scanner(System.in);

       while(true){
           String str =sc.nextLine();       // 문장 입력
           int alphabet[]=new int[26];      // 알파벳 배열생성
           if(str.equals("*")){             // * 입력되면 종료
               break;
           }
           for(int i=0;i<str.length();i++){ // 각문자를 알파벳 배열에 넣기
               if(str.charAt(i) == ' '){
                   continue;
               }
               else {
                   char ch = str.charAt(i);
                   alphabet[ch - 'a']++;
               }
           }
           int count=0;                     // 알파벳 갯수새기
           for(int i=0;i<26;i++){
               if(alphabet[i]!=0)           // 26개 다 들어갔는지 체크
               count++;
           }
           if(count==26){
               System.out.println("Y");
           }
           else{
               System.out.println("N");
           }
       }
    }
}
