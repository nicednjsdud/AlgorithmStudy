

import java.util.Scanner;

/*
    영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤,
    대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
 */
public class Back_2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //given
        String str=sc.nextLine();
        char arr[] = new char[str.length()];
        //when
        for(int i=0;i<str.length();i++){
            if(65<=str.charAt(i) && str.charAt(i)<=90){
                arr[i]=(char)(str.charAt(i)+32);

            }
            else if(97<=str.charAt(i) && str.charAt(i)<=122){
                arr[i]=(char)(str.charAt(i)-32);

            }
        }
        //then
        System.out.println(arr);


    }
}
