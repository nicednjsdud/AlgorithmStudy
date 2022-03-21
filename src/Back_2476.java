/*
 *  1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
 *  같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
 *  같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
 * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Back_2476 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 1. 입력
        int people_count = sc.nextInt();    // 사람 수
        int max=0;                          // 가장 많은 상금
        int dice_arr[]=new int[3];          // 주사위 수
        int price=0;

        // 2.1 주사위 수 입력
        for(int i=0;i<people_count;i++){
            dice_arr[0] = sc.nextInt();
            dice_arr[1] = sc.nextInt();
            dice_arr[2] = sc.nextInt();
        // 2.2 오름차순 정렬
            Arrays.sort(dice_arr);
            if(dice_arr[2]==dice_arr[1]){
                // 2.2 세개의 수가 모두 같다면
                if(dice_arr[1]==dice_arr[0]){
                    price = 10000 + (dice_arr[2] * 1000);
                }
                // 2.3 두개의 수만 같다면
                else{
                    price = 1000 + (dice_arr[2] *100);
                }
            }
            //2.4 제일 큰수 제외 두수만 같다면.
            else if(dice_arr[0]==dice_arr[1]){
                price = 1000 + (dice_arr[0] * 100);
            }
            // 2.5 모두 다르다면
            else{
                price = dice_arr[2]*100;
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
