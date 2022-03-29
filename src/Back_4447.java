import java.util.Scanner;

public class Back_4447 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //given
        int HeroNum=sc.nextInt();
        sc.nextLine();      //for안에 있는 sc.nextLine()가 반응하게 되어서 공백값으로 입력을 받는다.
        String str[]=new String[HeroNum];


        for(int i=0;i<HeroNum;i++){
            str[i]=sc.nextLine();
        }

        for(int i=0;i<HeroNum;i++) {
            int goodCount=0;
            int badCount=0;
            for(int j=0;j<str[i].length();j++){
                if(str[i].charAt(j)=='g'||str[i].charAt(j)=='G'){
                   goodCount++;
                }
                else if(str[i].charAt(j)=='b'||str[i].charAt(j)=='B'){
                    badCount++;
                }
                else{
                    continue;
                }
            }
            if(goodCount>badCount){
                System.out.println(str[i]+" is GOOD");
            }
            else if(goodCount<badCount){
                System.out.println(str[i]+" is A BADDY");
            }
            else{
                System.out.println(str[i]+" is NEUTRAL");
            }

        }


        sc.close();
    }
}
