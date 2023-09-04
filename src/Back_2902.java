import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        String cutStr[] = str.split("-");
        for (String s : cutStr) {
            sb.append(s.charAt(0));
        }
        System.out.println(sb);
        br.close();
    }
}
