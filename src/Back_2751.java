import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Collections.sort
public class Back_2751 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<N;i++){
            list.add(Integer.valueOf(br.readLine()));
        }
        // when
        Collections.sort(list);     // collections 오름차순 정렬

        // then
        for(Integer i : list){
            sb.append(i);
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
