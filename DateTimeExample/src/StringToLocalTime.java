import java.time.LocalTime;

public class StringToLocalTime {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.parse("22:15:30");
//        localTime.of(12,30 , 50);
        System.out.println(localTime);
    }
}
