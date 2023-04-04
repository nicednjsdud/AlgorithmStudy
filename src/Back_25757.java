import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Back_25757 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        HashSet<String> hs = new HashSet<>();
        int count = 0;
        while (N-- > 0) {
            String user = br.readLine();
            count += hs.contains(user) ? 0 : 1;
            hs.add(user);
        }
        if (game.equals("Y")) {
            System.out.println(count);
        } else if (game.equals("F")) {
            System.out.println(count / 2);
        } else {
            System.out.println(count / 3);
        }
        br.close();
    }
}
