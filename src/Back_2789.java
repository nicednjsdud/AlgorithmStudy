/*
    가장 많은 학생들이 유학을 가는 대학교는 영국의 캠브리지 대학교이다.
    정부는 인터넷 검열을 통해서 해외로 나가는 이메일의 내용 중 일부를 삭제하기로 했다.
    이메일의 각 단어 중에서 CAMBRIDGE에 포함된 알파벳은 모두 지우기로 했다.
    즉, 어떤 이메일에 LOVA란 단어가 있다면, A는 CAMBRIDGE에 포함된 알파벳이기 때문에,
    받아보는 사람은 LOV로 받는다.
    이렇게, 어떤 단어가 주어졌을 때, 검열을 거친 후에는 어떤 단어가 되는지 구하는 프로그램을 작성하시오.
    replace all() 메서드 사용
 */

import java.util.*;
public class Back_2789 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //given
        String str = sc.next();
        // then
        System.out.println(str.replaceAll("[CAMBRIDGE]",""));
    }
}



