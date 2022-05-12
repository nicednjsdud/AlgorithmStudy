import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_16171 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();  // 교과서 내용필기
        String str2 = br.readLine(); // 찾을 키워드
        String replace = str.replaceAll("[0-9]","");
        // 0-9숫자는 ""로 재정의

        // then
        if(replace.contains(str2)){ // str2 문자열이 있으면 1출력
            System.out.println(1);  
        }
        else{
            System.out.println(0);
        }
    }
}
