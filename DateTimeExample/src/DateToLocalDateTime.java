import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateTime {
    public static void main(String args[]) {
        DateToLocalDateTime dateToLocalDateTime = new DateToLocalDateTime();
        dateToLocalDateTime.testBackwardCompatability();
    }

    public void testBackwardCompatability() {
        //Get the current date
        Date currentDate = new Date();
        System.out.println("Current date: " + currentDate);
        //Get the instant of current date in terms of milliseconds
        Instant now = currentDate.toInstant();
        ZoneId currentZone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(now,
                currentZone);
        System.out.println("Local date: " + localDateTime);
    }
}
