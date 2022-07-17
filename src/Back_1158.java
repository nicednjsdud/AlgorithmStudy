import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_1158 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());        // 사람수
        int K = Integer.parseInt(token.nextToken());        // 제거 될 순서
        sb.append("<");
        Queue<Integer> qu = new LinkedList<>();
        for(int i=0;i<N;i++){
            qu.add(i+1);
        }
        // when
        while(!qu.isEmpty()){           // 큐에 사람이 모두 빌때까지
            for(int j=0;j<K;j++){
                if(j==K-1){
                        sb.append(qu.poll() + ", ");   // k번째 제거

                }
                else{
                    qu.add(qu.poll());  // k번째가 아닐경우 맨뒤로 다시 넣어주기
                }
            }
        }
        // then
        br.close();
        System.out.println(sb.substring(0,sb.length()-2)+">");
    }
}
