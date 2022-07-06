import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_10845 {

    public static int[] queue;

    public static int size = 0;

    public static void main(String[] args) throws IOException {

        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer token;
        int order_count = Integer.parseInt(br.readLine());
        queue = new int[order_count];
        // when

        while (order_count-- > 0) {
            token = new StringTokenizer(br.readLine() + " ");
            switch (token.nextToken()) {

                case "push":
                    push(Integer.parseInt(token.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "front":
                    sb.append(front()).append('\n');
                    break;
                case "back":
                    sb.append(back()).append('\n');
            }
        }
        // then
        System.out.println(sb);
        br.close();
    }

    public static void push(int n) {
        queue[size] = n;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        }
        int first_count = queue[0];
        if (size == 1) {
            size = 0;
        } else {
            for (int i = 1; i < size; i++) {
                queue[i-1]=queue[i];
            }
            size--;
        }
        return first_count;
    }
    public static int empty(){
        if(size==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static int size(){
        return size;
    }
    public static int front(){
        if(size==0){
            return -1;
        }
        int number = queue[0];
        return number;
    }
    public static int back(){
        if(size==0){
            return -1;
        }
        int number = queue[size-1];
        return number;
    }

}
