import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_5037 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean checkFlag = true;
        StringBuilder sb = new StringBuilder();
        while (checkFlag) {
           st = new StringTokenizer(br.readLine(), " ");

           int first_num = Integer.parseInt(st.nextToken());
           int second_num = Integer.parseInt(st.nextToken());
           int third_num = Integer.parseInt(st.nextToken());
           int max = Math.max(first_num,(Math.max(second_num,third_num)));
            if(first_num == 0 && second_num == 0 && third_num == 0){
                checkFlag = false;
            }
            else{
                if(max < (first_num + second_num + third_num - max)){
                    if(first_num == second_num){
                        if(second_num == third_num){
                            sb.append("Equilateral").append("\n");
                        }
                        else{
                            sb.append("Isosceles").append("\n");
                        }
                    }
                    else{
                        if(second_num == third_num){
                            sb.append("Isosceles").append("\n");
                        }
                        else if(first_num == third_num){
                            sb.append("Isosceles").append("\n");
                        }
                        else{
                            sb.append("Scalene").append("\n");
                        }
                    }
                }
                else{
                    sb.append("Invalid").append("\n");
                }
            }

        }
        System.out.println(sb);
        br.close();
    }
}
