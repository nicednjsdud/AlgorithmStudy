import java.util.Scanner;

public class Back_2920 {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        boolean upDown = false;
        String msg = "";
        for(int i = 0 ; i< 8; i++){
            int scale = sc.nextInt();
            if(i == 0){
                count = scale;
                if(count == 1){
                    upDown = true;
                }
            }
            else{
                if(upDown){
                    count ++ ;
                }
                else{
                    count -- ;
                }
            }
            if(scale == count){
                continue;
            }
            else{
                msg = "mixed";
            }
        }
        if(msg == ""){
            if(upDown){
                msg = "ascending";
            }
            else{
                msg = "descending";
            }
        }
        System.out.println(msg);
    }
}
