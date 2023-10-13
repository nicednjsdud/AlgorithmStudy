import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if(str.equals("EOI")){
                break;
            }
            if(str.toLowerCase().contains("nemo")){
                sb.append("Found").append("\n");
            }
            else{
                sb.append("Missing").append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
