import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_4659 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean endFlag = false;
        while (!endFlag) {
            String password = br.readLine();
            if (password.equals("end")) {
                endFlag = true;
            } else {
                boolean checkFlag = false;
                boolean vowelFlag = false;      // 모음 체크
                int vowelCount = 0;             // 자음 카운트
                int consonantCount = 0;         // 모음 갯수
                if (password.charAt(0) == 'a' || password.charAt(0) == 'e' || password.charAt(0) == 'i' || password.charAt(0) == 'o' || password.charAt(0) == 'u') {
                    vowelFlag = true;
                    vowelCount++;
                } else {
                    consonantCount++;
                }
                for (int i = 1; i < password.length(); i++) {

                    if (password.charAt(i) == password.charAt(i - 1)) {
                        if (password.charAt(i) == 'e' || password.charAt(i) == 'o') {
                            continue;
                        } else {
                            checkFlag = true;   // ee , oo 허용
                        }
                    }
                    if (password.charAt(i) == 'a' || password.charAt(i) == 'e' || password.charAt(i) == 'i' || password.charAt(i) == 'o' || password.charAt(i) == 'u') {
                        vowelFlag = true;
                        consonantCount = 0;
                        vowelCount++;
                    } else {
                        consonantCount++;
                        vowelCount = 0;
                    }
                    if (vowelCount == 3 || consonantCount == 3) {
                        checkFlag = true;   // 자음 모음 연속 3개이상
                    }
                }
                if (checkFlag == true || vowelFlag == false) {
                    sb.append("<" + password + "> is not acceptable.").append("\n");
                } else {
                    sb.append("<" + password + "> is acceptable.").append("\n");
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}
