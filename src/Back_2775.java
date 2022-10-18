import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2775 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_count = Integer.parseInt(br.readLine());
        // when
        for (int i = 0; i < test_count; i++) {
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());
            int count = 0;
            int apt[][] = new int[floor + 1][room + 2];
            int people_count = 1;
            // 0층 담아주기
            for (int k = 1; k <= room; k++) {
                apt[0][k] = people_count;
                people_count++;
            }
            if (floor != 0) {
                for (int j = 1; j <= floor; j++) {
                    people_count = 1;
                    for (int k = 1; k <= room; k++) {
                        apt[j][k] = people_count;
                        people_count = apt[j - 1][k + 1] + people_count;
                    }
                }
            }
            System.out.println(apt[floor][room]);
        }
        // then
        br.close();
    }
}
