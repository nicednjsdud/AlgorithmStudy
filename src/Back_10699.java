import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Back_10699 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String today = now.format(formatter);
        System.out.println(today);
    }
}
