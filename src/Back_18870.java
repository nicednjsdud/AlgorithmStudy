import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Back_18870 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int X[] = new int[N];
        int X_location[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        // when
        for (int i = 0; i < N; i++) {
            X[i] = Integer.parseInt(st.nextToken());
            X_location[i] = X[i];
        }
        // X_location 중복제거
        // 시간초과
//        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(X_location));
//        X_location = hashSet.toArray(new Integer[0]);
//        Arrays.sort(X_location);

        // 시간초과
//        X_location = Arrays.stream(X_location).distinct().toArray();

        Arrays.sort(X_location);

        // 중복제거
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int i : X_location) {
            if (!map.containsKey(i)) {
                map.put(i, idx++);
            }
        }
        // then
        for (int x : X) {
            sb.append(map.get(x)).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}
