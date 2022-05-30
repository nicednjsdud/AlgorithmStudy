import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10992 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());        // 입력
        int temp=1;
        // when
        for(int i=1;i<=N-1;i++){
            for(int j=temp;j<=N-1;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=((2*i)-1);j++){
                if(j%2 == 1 ){
                    if(j==1||j==(2*i)-1) {          // 중간에 별 뺴기,맨앞과 맨뒤별만 출력
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            temp++;
        }
        for(int i=0;i<(N*2)-1;i++){             // 맨밑줄은 따로출력
            System.out.print("*");
        }
        // then
        br.close();
    }
}

