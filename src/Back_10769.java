import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10769 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();           // 문자열 입력
        int happycount=0;                     // happy 카운트
        int sadcount=0;                       // sad 카운트
        char ch[] = new char[str.length()];   // 문자열 담을 char 배열 선언

        // when
        for(int i=0;i<str.length();i++){
            ch[i]=str.charAt(i);            // ch[]에 담기

        }
        for(int i=0;i<ch.length;i++){       // 구분
            if(ch[i]==':' && ch[i+1]=='-'){
                if(ch[i+2]==')'){           // 세개다 충족하면
                    happycount++;
                }
                else if(ch[i+2]=='('){
                    sadcount++;
                }
                else{
                    continue;
                }
            }
        }
        if(happycount>sadcount){
            System.out.println("happy");
        }
        else if(happycount<sadcount){
            System.out.println("sad");
        }
        else if(happycount==sadcount){
            if(happycount==0 && sadcount ==0){
                System.out.println("none");
            }
            else {
                System.out.println("unsure");
            }
        }
        br.close();
    }
}
