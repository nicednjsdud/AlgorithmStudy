import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_6588 {

    public static final int MAX = 1000000;

    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean arr[] = new boolean[MAX + 1];
        // when
        arr[0] = true;
        arr[1] = true;        // 0 하고 1은 빼주기

        for (int i = 2; i < Math.sqrt(MAX + 1); i++) {
            if(!arr[i]) {
                for (int j = i + i; j < arr.length; j += i) {
                    arr[j] = true;
                }
            }
        }
        int n = Integer.parseInt(br.readLine());
        // then
        while (true) {

            boolean ok = false;
            if (n == 0) {       // 0 이 입력되면 끝내기
                break;
            }
            for (int i = 2; i <= n/2; i++) {
                if (!arr[i] && !arr[n - i]){
                    System.out.println(n+" = "+i+" + "+(n-i));
                    ok = true;
                    break;
                }
            }
            if(!ok){
                System.out.println("Goldbach's conjecture is wrong.");
            }
            n = Integer.parseInt(br.readLine());
        }
    }
}
