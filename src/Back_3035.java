
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Back_3035 {
    public static void main(String[] args) throws IOException {

        // given
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        //when
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        while(sc.hasNextLine()){
            String book = sc.nextLine();
            if(book ==""){
                break;
            }
            list.add(book);
        }

        int x = arr[1]* arr[3] / list.get(0).length();
        int y = arr[0]* arr[2] / list.size();
        // then
        for(int i=0;i<list.size();i++){
            String str1="";
            for(int j=0;j<list.get(0).length();j++){
                for(int k=0;k<x;k++){
                    str1 +=list.get(i).charAt(j);
                }
                for(int k=0;k<y;k++){
                    System.out.println(str1);
                    System.out.println();
                }
            }
        }


    }
}
