import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2485 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 각 가로수간의 거리 구하기
        int dis[] = new int[N - 1];
        for (int i = 0; i < dis.length; i++) {
            dis[i] = arr[i + 1] - arr[i];
        }

        // 거리간의 최대 공약수 구하기
        int gcd = 0;
        gcd = gcd(dis[0], dis[1]);
        for (int i = 2; i < N - 2; i++) {
            gcd = gcd(gcd, dis[i]);
            if (gcd == 1) {
                break;
            }
        }
        // 각 거리/ 최대공약 -1값 모두 더하기
        int sum = 0;
        for (int i = 0; i < dis.length; i++) {
            sum += ((dis[i] / gcd) - 1);
        }
        System.out.println(sum);
        br.close();
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
}
