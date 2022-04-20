/*
두 정수 A와 B가 주어졌을 때, 두 정수 사이에 있는 수의 합을
구하는 프로그램을 작성하시오. 사이에 있는 수들은 A와 B도 포함한다. //시그마
 */

import java.util.Scanner;

public class Back_2355 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 1. 두 자연수 입력받기
        long A = sc.nextLong();
        long B = sc.nextLong();
        // 1.1 모든수의합
        long sum=0;

        // 2. A, B중 더큰수 찾기

        // 2.1 A가 B보다 크거나같을때
        if(A>=B){

           sum= (A+B)*(A-B+1) / 2;
        }
        // 2.2 B가 A보다 클때
        else if(A<B){

           sum= (B+A)*(B-A+1) / 2;

        }
      
        
        System.out.println(sum);
        sc.close();

    }
}
