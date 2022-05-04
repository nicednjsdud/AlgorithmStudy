import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10987 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch[]={'a','e','i','o','u'};            // 모음 배열 생성
        String str = br.readLine();                 // 단어 입력
        int count =0;                               // 갯수
        // when
        for(int i=0;i<str.length();i++){
            for(int j=0;j<ch.length;j++){
                if(str.charAt(i)==ch[j]){           // 단어 식별
                    count++;
                    break;
                }
            }
        }
        // then
        System.out.println(count);
    }

}
