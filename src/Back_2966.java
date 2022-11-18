import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2966 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 최소 공배수가 12이므로 맞추기
        char[] Adrian = {'A', 'B', 'C', 'A', 'B', 'C', 'A', 'B', 'C', 'A', 'B', 'C'};
        char[] Bruno = {'B', 'A', 'B', 'C', 'B', 'A', 'B', 'C', 'B', 'A', 'B', 'C'};
        char[] Goran = {'C', 'C', 'A', 'A', 'B', 'B', 'C', 'C', 'A', 'A', 'B', 'B'};
        int A_count = 0;
        int B_count = 0;
        int G_count = 0;
        int N = Integer.parseInt(br.readLine());
        String problem = br.readLine();
        problem.toUpperCase();  // 입력받은값이 혹시 소문자가 있을경우 대비
        int init_count = 0;     // 초기화 카운트
        // when
        for (int i = 0; i < N; i++) {
            if(init_count == 12) init_count = 0;
            if(problem.charAt(i) == Adrian[init_count]) A_count++;
            if(problem.charAt(i) == Bruno[init_count]) B_count++;
            if(problem.charAt(i) == Goran[init_count]) G_count++;
            init_count++;
        }
        // 최대수 구하기
        int max = Math.max(Math.max(A_count,B_count),G_count);
        // then
        System.out.println(max);
        if(max == A_count) System.out.println("Adrian");
        if(max == B_count) System.out.println("Bruno");
        if(max == G_count) System.out.println("Goran");
        br.close();
    }
}
