import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_19572 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int d1 = Integer.parseInt(token.nextToken());
        int d2 = Integer.parseInt(token.nextToken());
        int d3 = Integer.parseInt(token.nextToken());

        double a = (d1+d2-d3)/2.0;
        double b = (d1-d2+d3)/2.0;
        double c = (-d1+d2+d3)/2.0;

        if( a<=0 || b<=0|| c<=0){
            System.out.println(-1);
        }
        else{
            System.out.println(1);
            System.out.printf("%.1f %.1f %.1f",a,b,c);
        }
        br.close();
    }
}
