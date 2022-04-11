

import java.util.Scanner;

/*
    블랙잭
 */
public class Back_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //given
        int card_count=sc.nextInt();
        int max=sc.nextInt();
        int arr[] = new int[card_count];
        int tmp=0;
        int sum=0;
        //when
        for(int i=0;i<card_count;i++){
                arr[i]=sc.nextInt();
        }
        for(int i=0;i<card_count;i++){
            for(int j=i+1;j<card_count;j++){
                for(int k=j+1;k<card_count;k++){
                        sum=(arr[i]+arr[j]+arr[k]);
                        if(tmp<sum&&sum<=max){
                            tmp=sum;
                        }

                    }

                }
            }
        //then
        System.out.println(tmp);
        sc.close();
        }


    }

