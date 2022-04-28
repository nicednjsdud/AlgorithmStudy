
import java.util.Scanner;

public class Back_1371 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Alphabet[]=new int[26];             // 알파벳 갯수
        int max = 0;                            // 가장 많이 나온수
        while (sc.hasNextLine()) {
                 String str = sc.nextLine();
                 for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    Alphabet[str.charAt(i) - 'a']++;    // 26개의 배열에 각 알파벳 소문자 담기
                }
            }
        }
        for(int i=0;i<26;i++){
            if(Alphabet[i]>max){
                max=Alphabet[i];                // 가장 많이 나온수 찾기
            }
        }
        for(int i=0;i<26;i++){
            if(Alphabet[i]==max){
                System.out.print((char)(i+'a'));// 똑같이 나온수 찾기
            }
        }
        sc.close();
    }
}
