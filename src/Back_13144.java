import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_13144 {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 수열의 길이 N을 입력받음
        int N = Integer.parseInt(br.readLine());

        // 수열을 저장할 배열 생성
        int arr[] = new int[N];

        // 각 숫자가 방문되었는지 체크할 배열 생성 (숫자의 범위가 1 ~ 100000이므로 100001 크기로 선언)
        boolean isVisited[] = new boolean[100001];

        // 수열을 입력받아 arr 배열에 저장
        StringTokenizer token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }

        // 서로 다른 수로 이루어진 부분 수열의 개수를 셀 변수
        int count = 0;

        // 두 포인터 st와 en을 사용한 투 포인터 알고리즘
        // st는 부분 수열의 시작, en은 끝을 나타냄
        for (int st = 0, en = 0; st < N; st++) {
            // en 포인터를 오른쪽으로 이동하며 부분 수열 확장
            while (en < N) {
                // arr[en]이 이미 방문된 숫자라면 중복이므로 중단
                if (isVisited[arr[en]]) break;

                // arr[en]이 중복되지 않았다면 방문 체크 후 en을 증가시켜 부분 수열 확장
                isVisited[arr[en]] = true;
                en++;
            }
            // 중복이 발생하지 않는 부분 수열의 길이는 (en - st)임.
            // 따라서, 해당 시작점 st에서 만들 수 있는 부분 수열의 개수를 count에 더함
            count += (en - st);

            // st가 다음으로 넘어가므로 arr[st]를 방문하지 않은 상태로 변경
            isVisited[arr[st]] = false;
        }

        // 결과 출력 (서로 다른 숫자로 이루어진 부분 수열의 개수)
        System.out.println(count);
        br.close();
    }
}
