import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        long answer = 0;
        for (int i = 0; i < 3; i++) {
            String color = br.readLine();
            for (int j = 0; j < colors.length; j++) {
                if (color.equals(colors[j])) {
                    if (i == 0) {
                        answer += j * 10;
                    } else if (i == 1) {
                        answer += j;
                    } else {
                        answer *= Math.pow(10, j);
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
