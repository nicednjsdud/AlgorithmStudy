import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_20125 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String heart = "";
        int leftArm = 0;
        int rightArm = 0;
        int leftLeg = 0;
        int rightLeg = 0;
        int waist = 0;
        boolean headCheck = false;
        boolean armCheck = false;
        boolean upBodyCheck = false;
        boolean upBodyCheckWithArm = false;
        boolean legCheck = false;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int start_count = 0;
            int leg_start = 0;
            int startArm = 0;
            int startLeg = 0;
            for (int j = 0; j < N; j++) {

                if (!headCheck) {
                    if (str.charAt(j) == '*') {
                        heart = (i + 2) + " " + (j + 1)+ " ";    // heart.charAt(2) = 심장
                    }
                }
                if (headCheck && !upBodyCheckWithArm) {
                    if (str.charAt(j) == '*') {
                        if (start_count == 0) {
                            startArm = j + 1;
                        }
                        start_count++;
                    }
                    upBodyCheck = true;
                }
                if (headCheck && armCheck) {     // 허리 및 다리 체크;
                    if (str.charAt(j) == '*') {
                        start_count++;
                    }
                }
                if (legCheck) {
                    if (str.charAt(j) == '*') {
                        leg_start++;
                        startLeg = j + 1;         // 왼쪽 오른쪽다리 확인용
                    }
                }
            }
            if (!heart.equals("")) {          // 머리 체크 완료
                headCheck = true;
            }
            if (upBodyCheck && !armCheck) {
                armCheck = true;
                leftArm = Integer.parseInt(String.valueOf(heart.charAt(2))) - startArm;   // 왼팔 길이
                rightArm = start_count - 1 - leftArm;   // 오른팔 길이
                upBodyCheckWithArm = true;
            } else if (upBodyCheckWithArm) {
                if (legCheck) {
                    if (leg_start == 1) {
                        // 왼쪽 오른쪽인지 확인해야함
                        if (Integer.parseInt(String.valueOf(heart.charAt(2))) > startLeg) {
                            // 왼쪽 다리
                            leftLeg++;
                        } else {
                            rightLeg++;
                        }
                    } else if (leg_start == 2) {
                        rightLeg++;
                        leftLeg++;
                    }
                }
                else{
                    if(start_count == 1){
                        waist ++;
                    }
                    else{
                        legCheck = true;                // 다리 시작
                        rightLeg++;
                        leftLeg++;
                    }
                }
            }
        }
        System.out.println(heart);
        System.out.println(leftArm + " " + rightArm + " " + waist + " " + leftLeg + " " + rightLeg);
        br.close();
    }
}
