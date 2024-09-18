import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Back_1644 {

    static int n;
    static boolean[] isPrime;
    static List<Integer> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        makePrime();

        list = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if(!isPrime[i]) list.add(i);
        }

        int count = 0;
        for(int st = 0; st < list.size(); st++){
            int sum = 0;
            int en = st;
            while(en < list.size() && sum < n){
                sum += list.get(en);
                en++;
            }
            if(sum == n) count++;
        }
        System.out.println(count);
    }

    static void makePrime() {
        isPrime = new boolean[n+1];
        isPrime[0] = isPrime[1] = true;
        for (int i = 2; i*i <= n; i++) {
            if (isPrime[i]) continue;
            for (int j = i*i; j <= n; j+=i) {
                isPrime[j] = true;
            }
        }
    }
}
