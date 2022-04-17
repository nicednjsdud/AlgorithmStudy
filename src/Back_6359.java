import java.util.Scanner;

public class Back_6359 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int test_count= sc.nextInt();   // 테스트 갯수
        // 배열은 0부터 시작하니 0을 제외 하고 구한다.
        for(int i=0;i<test_count;i++){
            int room_count=sc.nextInt();               // 방 개수
            int arr[]=new int[room_count+1];             // 방
            if(room_count==0){
                System.out.println(room_count);
                break;
            }
            int count=1;                                // open close 체크카운트
            for(int j=1;j<arr.length;j++){              // 1이 open 0이 close
                for(int k=1;k<arr.length;k++){
                    if(k%count==0){
                        if(arr[k]==1){
                            arr[k]=0;
                        }
                        else if(arr[k]==0){
                            arr[k]=1;
                        }
                    }
                    else{
                        continue;
                    }
                }
                count++;
            }
            int open_count=0;
            for(int w=1;w<arr.length;w++){

                if(arr[w]==1) {
                    open_count++;
                }
            }
            System.out.println(open_count);
        }

        sc.close();
    }
}
