import java.util.Scanner;

public class Back_20499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split("/");

        int kill = Integer.parseInt(arr[0]);
        int death = Integer.parseInt(arr[1]);
        int assist = Integer.parseInt(arr[2]);

        if(kill + assist < death || death == 0){
            System.out.println("hasu");
        }
        else{
            System.out.println("gosu");
        }
        sc.close();
    }
}
