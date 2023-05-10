import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_9996 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        String pattern = br.readLine();
        int sIndex = pattern.indexOf("*");

        String pStart = pattern.substring(0, sIndex);
        String pEnd = pattern.substring(sIndex + 1);

        int sLength = pStart.length();
        int eLength = pEnd.length();

        // * 뺀 길이
        int pLength = pattern.length() - 1;

        for (int i = 0; i < N; i++) {

            String str = br.readLine();
            if (str.length() < pLength) {
                sb.append("NE").append("\n");
            }
            else{
                String sStart = str.substring(0,sLength);
                String sEnd = str.substring(str.length() - eLength);

                if(sStart.equals(pStart) && sEnd.equals(pEnd)){
                    sb.append("DA").append("\n");
                }
                else{
                    sb.append("NE").append("\n");
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}
