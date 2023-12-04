import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderChange {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss");

//       SEPARATE .........................................

        int year = calendar.get(calendar.DAY_OF_MONTH);
//      calendar.YEAR , calendar.MONTH , calendar.DAY_OF_WEEK , DAY_OF_MONTH , ...
        System.out.println(year);

//      CHANGE DATE  ......................................

        calendar.set(Calendar.YEAR, 2016);
        calendar.set(Calendar.MONTH, 01);

//      CALCULATE A DATE ..................................

        calendar.add(Calendar.MONTH,3);
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        calendar.add(Calendar.DAY_OF_MONTH,-10);
        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }
}
