import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalenderToDate {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss");
        String sDate = simpleDateFormat.format(date);
        System.out.println(sDate);

//      BRIEFLY   .........................................

        Calendar calendar1 = new GregorianCalendar(2019,3,15);
        System.out.println(simpleDateFormat.format(calendar1.getTime()));


    }
}
