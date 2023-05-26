import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1009 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long sum = a;
            boolean check = true;
            int arr[] = new int[100];
            for (int j = 0; j < b; j++) {
                sum = a * sum;
                String str = sum + "";
                if (arr.length == 0) {
                    arr[0] = str.charAt(str.length() - 1);
                } else {
                    if(check){
                        for (int k = 0; k < arr.length; k++) {
                            if(arr[k] == str.charAt(str.length()-1)){
                                check = false;
                            }
                        }
                        arr[j] = str.charAt(str.length()-1);
                    }
                }
            }
            int position = b % arr.length;
            sb.append(arr[position]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
