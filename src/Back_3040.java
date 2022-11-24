import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_3040 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int capNum[] = new int[9];
        int sum = 0;
        int two_fake_sum = 0;
        for (int i = 0; i < capNum.length; i++) {
            capNum[i] = Integer.parseInt(br.readLine());
            sum += capNum[i];
        }
        two_fake_sum = sum - 100;       // 가짜 두명의 합
        // when
        for (int i = 0; i < capNum.length; i++) {
            for (int j = i + 1; j < capNum.length; j++) {

                if (capNum[i] >= two_fake_sum || capNum[j] >= two_fake_sum) {
                    continue;
                } else {
                    if (capNum[i] + capNum[j] == two_fake_sum) {
                        capNum[i] = -1;
                        capNum[j] = -1;
                        break;
                    }
                }
            }
        }
        // then
        for (int i : capNum) {
            if (i == -1) continue;
            System.out.println(i);
        }
        br.close();
    }
}
