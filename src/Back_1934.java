import java.io.*;
import java.util.StringTokenizer;

public class Back_1934 {

    // 최대 공약수 구하기
    public static int GCD(int num1,int num2){
        if(num2==0){
            return num1;
        }
        else{
            return GCD(num2,num1%num2);
        }
    }
    // 최소 공배수 구하기
    public static int LCM(int num1,int num2){
        return num1 * num2 / GCD(num1,num2);
    }
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer token;
        int test_count = Integer.parseInt(br.readLine());
        // when
        for(int i=0;i<test_count;i++){
            token=new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(token.nextToken());
            int num2 = Integer.parseInt(token.nextToken());
            int gcd_result= GCD(num1,num2);
            int lcm_result= LCM(num1,num2);
            bw.write(lcm_result+"\n");
        }
        // then
        bw.flush();
        bw.close();
        br.close();
    }
}
