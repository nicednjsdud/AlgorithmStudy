package src;/*1에서부터 6까지의 눈을 가진 4개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
 * 같은 눈이 4개가 나오면 50,000원+(같은 눈)×5,000원의 상금을 받게 된다.
 * 같은 눈이 3개만 나오면 10,000원+(3개가 나온 눈)×1,000원의 상금을 받게 된다.
 * 같은 눈이 2개씩 두 쌍이 나오는 경우에는 2,000원+(2개가 나온 눈)×500원+(또 다른 2개가 나온 눈)×500원의 상금을 받게 된다.
 * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
 * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
 */


import java.util.Arrays;
import java.util.Scanner;

public class Back_2484 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                // 1. 입력
                int people_count = sc.nextInt();    // 사람 수
                int max=0;                          // 가장 많은 상금
                int dice_arr[]=new int[4];          // 주사위 수
                int price=0;                        // 상금

                // 2.1 주사위 수 입력
                for(int i=0;i<people_count;i++){
                    dice_arr[0] = sc.nextInt();
                    dice_arr[1] = sc.nextInt();
                    dice_arr[2] = sc.nextInt();
                    dice_arr[3] = sc.nextInt();
                    // 2.2 오름차순 정렬
                    Arrays.sort(dice_arr);
                    if(dice_arr[2]==dice_arr[3]){
                        // 2.2.1 네개의 수가 모두 같다면
                        if(dice_arr[1]==dice_arr[0] && dice_arr[2]==dice_arr[1]){
                            price = 50000+(dice_arr[3] * 5000);
                        }
                        // 2.2.2 세 개의 수만 같다면
                        else if(dice_arr[1]==dice_arr[3]||dice_arr[0]==dice_arr[3]){
                            price = 10000 + (dice_arr[3] * 1000);
                        }
                        // 2.2.3 서로 두쌍식 같은경우
                        else if (dice_arr[1]==dice_arr[0]&&dice_arr[1]!=dice_arr[3]){
                            price = 2000 + (dice_arr[3] * 500) + (dice_arr[0] * 500);
                        }
                        // 2.2.4 두개만 같은 경우
                        else{
                            price = 1000+ (dice_arr[3]*100);
                        }
                    }
                    else if(dice_arr[1]==dice_arr[2]){
                        // 2.3.1 세 개의 수만 같다면
                        if(dice_arr[0]==dice_arr[1]) {
                            price = 10000 + (dice_arr[2] * 1000);
                        }
                        // 2.3.2 두개만 같은 경우
                        else{
                            price = 1000 + (dice_arr[2]*100);
                        }
                    }
                    else if (dice_arr[0]==dice_arr[1]){
                        // 2.4.1 두개만 같은 경우
                            price = 1000+ (dice_arr[1] * 100);
                        }
                    else{
                        // 2.5.1 모두 다른 경우
                        price = dice_arr[3] * 100;
                    }

                    // 2.6 가장 큰 상금 구하기
                    if(max<price){
                        max=price;
                    }


                }
                // 3. 상금 출력
                System.out.println(max);
            }
        
}
