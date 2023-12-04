import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDate date = currentTime.toLocalDate();
        Month month = currentTime.getMonth();
        int seconds = currentTime.getSecond();
        System.out.println(date);
        System.out.println(month);
        System.out.println(seconds);
    }
}
