import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1018 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        String board[] = new String[row];

        for (int i = 0; i < row; i++) {
            board[i] = br.readLine();
        }

        int sol = Integer.MAX_VALUE;

        for (int i = 0; i <= row - 8; i++) {
            for (int j = 0; j <= col - 8; j++) {
                int curSol = solved(i, j, board);

                sol = Math.min(curSol, sol);
            }
        }
        System.out.println(sol);
        br.close();
    }

    private static int solved(int startRow, int startCol, String[] board) {
        String orgBoard[] = {"WBWBWBWB", "BWBWBWBW"};
        int count = 0;

        for (int i = 0; i < 8; i++) {
            int row = startRow + i;
            for (int j = 0; j < 8; j++) {
                int col = startCol + j;

                if (board[row].charAt(col) != orgBoard[row % 2].charAt(j)) {
                    count++;
                }
            }
        }
        return Math.min(count, 64 - count);
    }
}
