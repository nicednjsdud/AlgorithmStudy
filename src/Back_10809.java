import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10809 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int Alphabet[] = new int[26];
        for (int i = 0; i < Alphabet.length; i++) {
            Alphabet[i] = -1;                     // 먼저 알파벳 배열에 모두 -1 주입
        }
        // when
        for (int i = 0; i < str.length(); i++) {
            int Alphabet_count = str.charAt(i) - 97;
            if (Alphabet[Alphabet_count] != -1) {   // 먼저 들어간 알파벳이 있다면 건너뛰기
                continue;
            } else {
                Alphabet[Alphabet_count] = i;
            }
        }
        // then
        for (int i : Alphabet) {
            System.out.print(i+" ");
        }
        br.close();
    }
}
