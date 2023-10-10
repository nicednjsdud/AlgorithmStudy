import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Back_1431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str[] = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                } else if (o1.length() == o2.length()) {
                    if (check(o1) == check(o2)) {
                        return o1.compareTo(o2);
                    }
                    else{
                        return Integer.compare(check(o1),check(o2));
                    }
                }
                else{
                    return 1;
                }
            }
        });
        for (String s : str) {
            System.out.println(s);
        }
    }

    private static int check(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                sum += s.charAt(i) - '0';
            }
        }
        return sum;
    }
}
