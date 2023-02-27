import java.util.Scanner;

public class Back_2606 {

    static int arr[][];    // 그래프 배열
    static boolean check[];

    static int count = 0;
    static int n = 0;
    static int m = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n + 1][n + 1];
        check = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            arr[first][second] = arr[second][first] = 1;
        }
        dfs(1);
        System.out.println(count - 1);
    }

    static void dfs(int start) {
        check[start] = true;
        count++;

        for (int i = 0; i <= n; i++) {
            if (arr[start][i] == 1 && !check[i]) {
                dfs(i);
            }
        }
    }
}
