import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Back_2628 {

    static int x;
    static int y;
    static int n;
    static int maxX;
    static int maxY;
    static ArrayList<Integer> colList = new ArrayList<>();
    static ArrayList<Integer> rowList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        colList.add(0);
        colList.add(x);
        rowList.add(0);
        rowList.add(y);

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int culType = Integer.parseInt(st.nextToken());

            if (culType == 0) rowList.add(Integer.parseInt(st.nextToken()));
            else colList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(colList);
        Collections.sort(rowList);

        cutRow();
        cutCul();
        System.out.println(maxX * maxY);
        br.close();
    }

    private static void cutRow() {
        for (int i = 0; i < rowList.size() - 1; i++) {
            int dis = rowList.get((i+1)) - rowList.get(i);
            maxY = Math.max(dis,maxY);
        }
    }

    private static void cutCul() {
        for (int i = 0; i < colList.size() - 1; i++) {
            int dis = colList.get((i+1)) - colList.get(i);
            maxX = Math.max(dis,maxX);
        }
    }


}
