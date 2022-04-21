import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Back_10102 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int v = Integer.parseInt(br.readLine());                // 심사위원 수
        char ch[] = new char[v];

        for(int i=0;i<v;i++){
           ch[i]= (char) br.read();
        }
        int Acount=0;
        int Bcount=0;
        for(int i=0;i<v;i++){

            if(ch[i]=='A'){
                Acount++;
            }
            else if(ch[i]=='B'){
                Bcount++;
            }
        }
        if(Acount>Bcount){
            System.out.println("A");
        }
        else if(Acount<Bcount){
            System.out.println("B");
        }
        else{
            System.out.println("Tie");
        }
        br.close();
    }
}
