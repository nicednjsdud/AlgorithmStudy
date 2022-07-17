import java.io.*;
import java.util.*;

public class Back_1168 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());        // 사람수
        int K = Integer.parseInt(token.nextToken()) - 1;
        // 제거 될 순서 index가 0부터 시작하므로 -1
        sb.append("<");
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        // when
        int index = K;
        while (true) {
            sb.append(list.get(index));
            list.remove(index);
            if (list.size() == 0) break;
            index += K;
            index %= list.size();
            sb.append(", ");

        }
        sb.append(">");
        // then
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
