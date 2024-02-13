import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Back_10808_2 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
        br.close();
    }
}
