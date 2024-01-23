import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * 이분탐색 ( 주의 이분탐색은 항상 정렬을 해야함 )
 * A + B 를 먼저 더해 집합 list를 만든뒤 (list)
 * C를 대입하여 이전 arr에 가장 큰수를 구한다.
 */
public class Back_2295 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                list.add(arr[i] + arr[j]);
            }
        }
        Arrays.sort(arr);
        Collections.sort(list);
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < N; j++) {
                int gap = arr[i] - arr[j];
                if (binarySearch(list, gap)) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
        br.close();
    }

    private static boolean binarySearch(List<Integer> list, int gap) {
        int min = 0;
        int max = list.size() - 1;

        while (min < max) {
            int mid = (max + min) / 2;
            if(list.get(mid) == gap) return true;
            else if(list.get(mid) > gap) max = mid -1;
            else min = mid + 1;
        }
        return false;
    }

}
