import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDataTimeExample {
    public static void main(String[] args) {
        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println(currentZone);
        ZonedDateTime date = ZonedDateTime.now();
        System.out.println(date);
    }
}
