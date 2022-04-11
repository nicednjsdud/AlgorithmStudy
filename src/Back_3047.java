package src;

import java.util.Arrays;
import java.util.Scanner;

public class Back_3047 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num[]=new int [3];

        int temp=0;

        for(int i=0;i<3;i++) {
            num[i]=sc.nextInt();
        }

        Arrays.sort(num);
        String str=sc.next();
            if(str.charAt(0)=='A'){
                if(str.charAt(1)=='B'){
                    Arrays.sort(num);                   // 1.2.3
                }
                else if(str.charAt(1)=='C'){                   // 1.3.2
                    temp=num[1];
                    num[1]=num[2];
                    num[2]=temp;
                }
            }
            else if(str.charAt(0)=='B'){                       // 2.1.3
                if(str.charAt(1)=='A'){
                    temp=num[1];
                    num[1]=num[0];
                    num[0]=temp;
                }
                else if(str.charAt(1)=='C'){                    // 2.3.1
                    temp=num[0];
                    num[0]=num[1];
                    num[1]=num[2];
                    num[2]=temp;
                }
            }
            else if(str.charAt(0)=='C'){
                if(str.charAt(1)=='A'){                            // 3.1,2
                    temp=num[0];
                    num[0]=num[2];
                    num[2]=num[1];
                    num[1]=temp;
                }
                else if(str.charAt(1)=='B'){                        // 3.2.1
                    temp=num[0];
                    num[0]=num[2];
                    num[2]=temp;
                }
            }
        for(int i=0;i<3;i++){
            System.out.print(num[i]+" ");
        }


    }
}
