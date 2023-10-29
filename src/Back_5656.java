import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_5656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 1;
        while (true) {
            String str = br.readLine();
            String[] tempStr = str.split(" ");
            if (tempStr[1].equals("E")) {
                break;
            } else {
                sb.append(String.format("Case %d: %s\n", count++,getResult(Integer.parseInt(tempStr[0]), Integer.parseInt(tempStr[2]), tempStr[1])?"true":"false"));
            }
        }
        System.out.println(sb);
        br.close();
    }
    private static boolean getResult(int a, int b, String op) {
        switch (op) {
            case ">":   return a>b;
            case ">=":  return a>=b;
            case "<":   return a<b;
            case "<=":  return a<=b;
            case "==":  return a==b;
            case "!=":  return a!=b;
        }
        return false;
    }
}
