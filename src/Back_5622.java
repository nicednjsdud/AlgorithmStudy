import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_5622 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        // 다이얼 1부터 시작
        int time = 0;
        // when
        for(int i=0;i<str.length();i++){

            if(str.charAt(i) == 'A' || str.charAt(i) == 'B' || str.charAt(i) == 'C' )
                time += 3;
            else if(str.charAt(i) == 'D' || str.charAt(i) == 'E' || str.charAt(i) == 'F')
                time += 4;
            else if(str.charAt(i) == 'G' || str.charAt(i) == 'H' || str.charAt(i) == 'I')
                time += 5;
            else if(str.charAt(i) == 'J' || str.charAt(i) == 'K' || str.charAt(i) == 'L')
                time += 6;
            else if(str.charAt(i) == 'M' || str.charAt(i) == 'N' || str.charAt(i) == 'O')
                time += 7;
            else if(str.charAt(i) == 'P' || str.charAt(i) == 'Q' || str.charAt(i) == 'R' || str.charAt(i) == 'S')
                time += 8;
            else if(str.charAt(i) == 'T' || str.charAt(i) == 'U' || str.charAt(i) == 'V')
                time += 9;
            else if(str.charAt(i) == 'W' || str.charAt(i) == 'X' || str.charAt(i) == 'Y' || str.charAt(i) == 'Z')
                time += 10;
        }
        // then
        System.out.println(time);
        br.close();
    }
}
