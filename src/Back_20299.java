import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Back_20299 {
    public static void main(String[] args) throws Exception{

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int team_count =Integer.parseInt(token.nextToken());    // 팀의수
        int rating_sum =Integer.parseInt(token.nextToken());    // 레이팅 합
        int private_rating = Integer.parseInt(token.nextToken());   // 개인 레이팅조건
        int count =0;   // 클럽가능한 팀의 수
        // when

        for(int i=0;i<team_count;i++){
            token = new StringTokenizer(br.readLine());
            int t1 =Integer.parseInt(token.nextToken());    // 팀원1
            int t2 =Integer.parseInt(token.nextToken());    // 팀원2
            int t3 =Integer.parseInt(token.nextToken());    // 팀원3
        // then
            if(rating_sum<=(t1+t2+t3)){
                if(private_rating<=t1&&private_rating<=t2&&private_rating<=t3){
                    count ++;
                    sb.append(t1+" ");
                    sb.append(t2+" ");
                    sb.append(t3+" ");// 리스트에 담기
                }
            }

        }
        System.out.println(count);
        System.out.println(sb);
        br.close();
    }

}
