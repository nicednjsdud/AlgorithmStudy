package src;/*왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다.
일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다.
뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
 */


import java.util.Arrays;
import java.util.Scanner;

public class Back_2309 {
    public static void main(String[] args){
        //1.입 력
        Scanner sc = new Scanner(System.in);
        //1.1 난쟁이들 수입력
        int nan[]=new int[9];
        //1.2 합 ,합오차 입력
        int sum=0;
        int remainder=100;
        int spyA=0;
        int spyB=0;
        //1.3 난쟁이들 9명 수 입력받기
        for(int i=0;i<nan.length;i++){
            nan[i]=sc.nextInt();
        }
        //2.1 난쟁이들 총합 계산(9명)
        for(int i=0;i< nan.length;i++){
            sum+=nan[i];
        }
        //2.2 나머지 계산 (sum-100)
        remainder=sum-remainder;
        //2.3 나머지랑 맞는 두사람 제거
        for(int i=0;i<nan.length;i++){
            for(int j=1;j< nan.length;j++){
                if(nan[i]+nan[j]==remainder){
                    spyA=nan[i];
                    spyB=nan[j];

                }
            }
        }
        //2.4 오름차순 정렬
        Arrays.sort(nan);
        //3.1 출력
        for(int i=0;i<nan.length;i++){
            if(nan[i]==spyA || nan[i]==spyB){
                continue;
            }
            System.out.println(nan[i]);
        }

    }
}
