package src;

import java.util.Scanner;

public class Back_2846{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //given
        int num = sc.nextInt();
        int street[] = new int[num];
        int size = 0;
        int size_temp = 0;
        //when
        for (int i = 0; i < num; i++) {
            // 길 입력받기
            street[i] = sc.nextInt();
        }
        for (int i = 0; i < num-1; i++) {
            // 다음으로 배열이 클때 더하기
            if (street[i] < street[i + 1]) {
                size += street[i + 1] - street[i];

            }
            else {
                // 다음으로 오는 배열이 작거나 같을때 그전 size 변수에저장
                if (size_temp < size) {
                    size_temp = size;
                }
                // size 초기화
                size=0;
            }
            }
        //then
        if(size_temp>=size){
            System.out.println(size_temp);
        }
        else{
            System.out.println(size);
        }
    }
}