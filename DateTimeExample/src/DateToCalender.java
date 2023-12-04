import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToCalender {
    public static void main(String[] args) {
        Date date= new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,4 );
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }

}
