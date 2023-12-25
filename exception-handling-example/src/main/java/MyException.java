import java.time.LocalDate;
import java.time.LocalDateTime;

public class MyException extends Exception{
    public MyException(String message) {
        super(message);
        System.out.println("----------------");
        LocalDateTime localDateTime = LocalDateTime.now();
        String time = localDateTime.toString();
        System.out.println(time);
    }
}
