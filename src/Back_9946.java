import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Back_9946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 1;
        while (true) {
            String complete_word = br.readLine();
            String collect_word = br.readLine();
            if (collect_word.equals("END") && complete_word.equals("END")) {
                break;
            }
            if(complete_word.length() == collect_word.length()){
                char comp_arr[] = new char[complete_word.length()];
                char col_arr[] = new char[collect_word.length()];
                for(int i = 0;i<complete_word.length();i++){
                    comp_arr[i] = complete_word.charAt(i);
                    col_arr[i] = collect_word.charAt(i);
                }
                Arrays.sort(comp_arr);
                Arrays.sort(col_arr);
                boolean check = true;
                for(int i = 0;i<complete_word.length();i++){
                    if(col_arr[i] != comp_arr[i]){
                        check = false;
                        break;
                    }
                }
                if(check){
                    sb.append("Case "+ count +": same");
                }
                else{
                    sb.append("Case "+ count +": different");
                }
            }
            else{
                sb.append("Case "+ count +": different");
            }
            count++;
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
