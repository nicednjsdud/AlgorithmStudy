import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Back_4344 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#0.000");
        StringTokenizer st;
        int students = Integer.parseInt(br.readLine());

        for (int i = 0; i < students; i++){
            st = new StringTokenizer(br.readLine());
            int student_count = Integer.parseInt(st.nextToken());
            int scores[] = new int[student_count];
            int sum = 0;
            // when
            for(int j=0;j<student_count;j++){

                int score = Integer.parseInt(st.nextToken());
                scores[j] = score;
                sum += score;
            }
            int pass_count = 0;
            double avg = (double)(sum/student_count);
            for(int j=0;j<scores.length;j++){
                if(scores[j] > avg){
                    pass_count++;
                }
            }

            double d_sum = Math.round((double)pass_count/(double)student_count*100000) /1000.0;

            sb.append(df.format(d_sum)).append("%").append("\n");
        }
        // then
        System.out.println(sb);
        br.close();
    }
}
