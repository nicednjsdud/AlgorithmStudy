import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Back_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            hashSet.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String temp = br.readLine();
            if(hashSet.contains(temp)){
                result.add(temp);
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }
        br.close();
    }
}
