import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1003 {




    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int arr[] = new int[T];
        for(int i = 0; i< T;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        // Fibonacci(n) 0 개수는 = Fibonacci(n-1) 1의개수
        // Fibonacci(n) 1 개수는 = Fibonacci(n-1) 0 + 1 의개수이다.

        for (int i = 0; i < T; i++) {
            int zero_count = 0;
            int first_count = 1;

            if(arr[i] == 0){
                zero_count = 1;
                first_count = 0;
                System.out.println(zero_count + " " + first_count);
            }
            else if(arr[i] == 1){
                System.out.println(zero_count + " " + first_count);
            }
            else{
                for (int j = 2; j <= arr[i]; j++) {
                    int temp = zero_count;
                    zero_count = first_count;
                    first_count = temp + first_count;
                }
                System.out.println(zero_count + " " + first_count);
            }

        }
        br.close();
    }



}
