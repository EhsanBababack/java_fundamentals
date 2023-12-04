import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss");
        String dateInString = "2023/December/01 20:11:14";
        Date date = null;
        try {
            date = sdf.parse(dateInString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);

    }
}
