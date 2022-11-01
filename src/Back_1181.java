import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Back_1181 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str[] = new String[N];
        // when
        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) { // 0,1 번째 비교, 1,2번째 비교
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });
        // then
        System.out.println(str[0]);
        for (int i = 1; i < N; i++) {
            if (!str[i].equals(str[i - 1])) { // 중복이 아니라면 출력
                System.out.println(str[i]);
            }
        }
        br.close();
    }
}
