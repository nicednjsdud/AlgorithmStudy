import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.lang.Character.*;

public class Back_10757 {
    public static void main(String[] args) throws IOException {

        // given
        // String index exception

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        String A = st.nextToken();
//        String B = st.nextToken();
//        if (A.length() < B.length()) {
//            String temp = A;
//            A = B;
//            B = temp;
//
//        }
//        int arr[] = new int[A.length()];
//        int count = 0;
//        int ten_count = 0;
//        // when
//        for (int i = A.length()-1; i >= 0; i--) {
//            if (count >= 10) {
//                ten_count = 1;
//            } else {
//                ten_count = 0;
//            }
//            count = 0;
//            if (A.length() - B.length() > i) {
//                arr[i] = A.charAt(i);
//            }
//            // 첫째자리수에 도달했을때
//            else if (A.length() - B.length() == i) {
//                arr[i] = getNumericValue(A.charAt(i)) + getNumericValue(B.charAt(i));
//                break;
//            } else {
//                if (ten_count == 1) {
//                    count = getNumericValue(A.charAt(i)) + getNumericValue(B.charAt(i)) + 1;
//
//                    // 자리수 합이 10이 넘을때
//                    if (count >= 10) {
//                        arr[i] = count % 10;
//
//                    } else {
//                        arr[i] = count;
//                    }
//                } else if (ten_count == 0) {
//
//                    count = getNumericValue(A.charAt(i)) + getNumericValue(B.charAt(i));
//
//                    if (count >= 10) {
//
//                        arr[i] = count % 10;
//                    } else {
//                        arr[i] = count;
//                    }
//                }
//            }
//        }
//        // then
//        br.close();
//        for (int i : arr) {
//            System.out.print(i);
//        }

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

        A = A.add(B);
        // when
        System.out.println(A);

        // then
    }
}
