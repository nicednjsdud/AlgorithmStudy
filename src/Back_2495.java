import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Back_2495 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[3];
        for(int i = 0; i < 3; i++){
            arr[i] = br.readLine();
        }
        for(int i = 0; i < 3; i++){
            int max = 1;
            int count = 1;
            for(int j = 0; j < arr[i].length() - 1; j++){
                if(arr[i].charAt(j) == arr[i].charAt(j + 1)){
                    count++;
                    max = Math.max(max, count);
                } else {
                    count = 1;
                }
            }
            System.out.println(max);
        }

    }
}
