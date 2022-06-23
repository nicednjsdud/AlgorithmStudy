import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Back_10814 {
    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer token;
        int member_count = Integer.parseInt(br.readLine());   // 회원의 수 입력
        Person[] p = new Person[member_count];
        // when
        for(int i=0;i<member_count;i++){
            token = new StringTokenizer(br.readLine()," ");
            int age = Integer.parseInt(token.nextToken());
            String name=token.nextToken();
            p[i]=new Person(age,name);          // Person 객체에 나이,이름삽입
        }
        Arrays.sort(p, Comparator.comparingInt(s -> s.age));    // 이것에 대하여 공부

        // then
        for(int i=0;i<member_count;i++){
            sb.append(p[i].age+" "+p[i].name+"\n");
        }
        System.out.println(sb);
    }
    public static class Person{
        int age;
        String name;

        public Person(int age,String name){
            this.age=age;
            this.name=name;
        }


    }

}
