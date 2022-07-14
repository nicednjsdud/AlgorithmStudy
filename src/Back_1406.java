import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Back_1406 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();             // 문자열 입력
        int count = Integer.parseInt(br.readLine());    // 입력할 명령어의 개수
        LinkedList<Character> list = new LinkedList<>();


        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));                   // 리스트에 문자 하나씩 추가
        }
        ListIterator<Character> iter = list.listIterator();

        while (iter.hasNext()) {
            iter.next();        // 처음 커서는 맨뒤에 위치해줌
        }
        // when
        for (int i = 0; i < count; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            switch (c) {
                case 'L':
                    if (iter.hasPrevious()) {
                        iter.previous();       // 명령어 L
                    }
                    break;
                case 'D':
                    if (iter.hasNext()) {
                        iter.next();       // 명령어 D
                    }
                    break;
                case 'B':
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();   // 명령어 B
                    }
                    break;
                case 'P':
                    char ch = command.charAt(2);
                    iter.add(ch);// 명령어 P
                    break;
            }
        }
        // then
        br.close();
        for (Character character : list) {
            bw.write(character);
        }
        bw.flush();
        bw.close();
    }
}
