import java.io.*;
import java.util.StringTokenizer;

public class Back_15552 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token;
        int count = Integer.parseInt(br.readLine());
        // when
        for (int i = 0; i < count; i++) {
            token = new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(token.nextToken())+Integer.parseInt(token.nextToken())+"\n");
        }
        // then
        bw.flush();
        bw.close();
        br.close();
    }
}
