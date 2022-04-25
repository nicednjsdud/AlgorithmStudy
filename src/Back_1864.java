import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Back_1864{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        int sum=0;
        while(true){

            String str = br.readLine();
            if(str.equals("#")){        // 입력 #이 들어오면 종료
                break;
            }
            for(int i=0;i<str.length();i++){
                int temp=0;             // 기호를 숫자로 바꿔주기
                switch(str.charAt(i)) {
                    case '-':
                        temp = 0;
                        break;
                    case '\\':
                        temp = 1;
                        break;
                    case '(':
                        temp = 2;
                        break;
                    case '@':
                        temp = 3;
                        break;
                    case '?':
                        temp = 4;
                        break;
                    case '>':
                        temp = 5;
                        break;
                    case '&':
                        temp = 6;
                        break;
                    case '%':
                        temp = 7;
                        break;
                    case '/':
                        temp = -1;
                }
                sum +=temp*Math.pow(8,str.length()-1-count);// 8진수를 10진수로 변환
                count++;
            }
            System.out.println(sum);
            count=0;
            sum=0;
        }
        br.close();
    }

}

