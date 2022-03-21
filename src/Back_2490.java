
/*
        우리나라 고유의 윷놀이는 네 개의 윷짝을 던져서 배(0)와 등(1)이 나오는 숫자를 세어 도, 개, 걸, 윷, 모를 결정한다.
        네 개 윷짝을 던져서 나온 각 윷짝의 배 혹은 등 정보가 주어질 때
        도(배 한 개, 등 세 개), 개(배 두 개, 등 두 개), 걸(배 세 개, 등 한 개), 윷(배 네 개), 모(등 네 개)
        중 어떤 것인지를 결정하는 프로그램을 작성하라.
 */

import java.util.Scanner;
public class Back_2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // given
        int arr[]=new int[4];
        // when
        for(int j=0;j<3;j++) {
            int count=0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1) {
                    count++;
                }
            }
            //  then
            if (count == 4) {
                System.out.println("E");
            } else if (count == 3) {
                System.out.println("A");
            } else if (count == 2) {
                System.out.println("B");
            } else if (count == 1) {
                System.out.println("C");
            } else if(count==0){
                System.out.println("D");
            }

        }
    }
}
