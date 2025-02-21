import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Back_1541 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        String[] splitByMinus = str.split("-");   // '-' 기준으로 나누기
        int result = sumNumbers(splitByMinus[0]);       // 첫 번째 그룹은 더하기

        for (int i = 1; i < splitByMinus.length; i++) {
            result -= sumNumbers(splitByMinus[i]);      // 이후 그룹은 모두 빼기
        }
        br.close();
        System.out.println(result);
    }

    private static int sumNumbers(String numbers) {
        String[] splitByPlus = numbers.split("\\+");  // '+' 기준으로 나누기
        int sum = 0;
        for (String num : splitByPlus) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
