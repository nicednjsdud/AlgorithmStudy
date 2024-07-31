import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Back_9243 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String before = br.readLine();
        String after = br.readLine();

        if(N % 2 == 0){
            if(before.equals(after)){
                System.out.println("Deletion succeeded");
            } else {
                System.out.println("Deletion failed");
            }
        } else {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < before.length(); i++){
                if(before.charAt(i) == '0'){
                    sb.append('1');
                } else {
                    sb.append('0');
                }
            }
            if(sb.toString().equals(after)){
                System.out.println("Deletion succeeded");
            } else {
                System.out.println("Deletion failed");
            }
        }
    }
}
