import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_9094 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test_count = Integer.parseInt(br.readLine()); // 테스트 카운트 읽기

        for(int i=1;i<=test_count;i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(token.nextToken());
            int m = Integer.parseInt(token.nextToken());
            int count =0;
            for(int a=1;a<n;a++){

                for(int b=a+1;b<n;b++){

                    if((((a*a)+(b*b)+m)%(a*b))==0){ // 나머지가 0이아니면 정수x
                        count++;                    // 정수 찾기
                    }
                }
            }
            System.out.println(count);

        }
    }
}
