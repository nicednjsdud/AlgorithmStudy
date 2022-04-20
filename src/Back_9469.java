import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_9469 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P=Integer.parseInt(br.readLine());      // 테스트 개수

        for(int i=1;i<=P;i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(token.nextToken());        // 번호
            double N = Double.parseDouble(token.nextToken());       // 철로의 길이
            double A = Double.parseDouble(token.nextToken());       // A 기차 속도
            double B = Double.parseDouble(token.nextToken());       // B 기차 속도
            double F = Double.parseDouble(token.nextToken());       // 파리 속도

            double length = (N/(A+B))*F;

            System.out.printf("%d %.6f\n",count,length);
        }


    }
}
