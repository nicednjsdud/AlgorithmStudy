/*

 */

import java.util.Scanner;

public class Back_2386 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int count=0;
            String str=sc.nextLine();
            if (str.equals("#")) {
                break;
            }
            for(int i=1;i<str.length();i++){
                    if(str.charAt(0)==str.charAt(i)||
                            str.charAt(0)== (str.charAt(i)+32)){
                        count++;
                    }

                }
            System.out.println(str.charAt(0)+ " " +count);
            }
            sc.close();
            }

    }

