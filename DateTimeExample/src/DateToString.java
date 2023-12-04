import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss");
        String sDate = simpleDateFormat.format(date);
        System.out.println(sDate);
    }
}
