import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_25024 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());        // Test Count
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int change_count = 0;

            // when
            for (int j = 0; j < 2; j++) {
                if (change_count == 0) {  // 시 분 구하기
                    if (x < 24) {
                        if (y < 60) {
                            sb.append("Yes");
                        } else {
                            sb.append("No");
                        }
                    } else {
                        sb.append("No");
                    }
                    sb.append(" ");
                } else if (change_count == 1) {     // 월 일 구하기
                    if (x > 0 && x < 13) {
                        if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
                            if (y > 0 && y < 32) {
                                sb.append("Yes");
                            } else {
                                sb.append("No");
                            }
                        } else if (x == 2) {
                            if (y > 0 && y < 30) {
                                sb.append("Yes");
                            } else {
                                sb.append("No");
                            }
                        } else {
                            if (y > 0 && y < 31) {
                                sb.append("Yes");
                            } else {
                                sb.append("No");
                            }
                        }
                    } else {
                        sb.append("No");
                    }
                }
                change_count++;
            }
            sb.append("\n");
        }
        // then
        br.close();
        System.out.println(sb);
    }
}
