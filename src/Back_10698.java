import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_10698 {
    public static void main(String[] args) throws Exception{

        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());        // 테스트 케이스 입력

        //when
        for(int i=0;i<T;i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(token.nextToken());
            String str = token.nextToken();
            int num2 = Integer.parseInt(token.nextToken());
            String str2 = token.nextToken();
            int num3 = Integer.parseInt(token.nextToken());
            //then
            if(str.equals("+")){
                if(num1 + num2 == num3){
                    System.out.println("Case "+(i+1)+": YES");
                }
                else{
                    System.out.println("Case "+(i+1)+": NO");
                }
            }
            else if(str.equals("-")){
                if(num1 - num2 == num3){
                    System.out.println("Case "+(i+1)+": YES");
                }
                else{
                    System.out.println("Case "+(i+1)+": NO");
                }
            }
        }
        br.close();

        

    }
}
