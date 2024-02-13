import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JsonToObject {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try (Reader reader = new FileReader("./staff.json")) {
            // Convert JSON File to Java Object
            Staff staff = gson.fromJson(reader, Staff.class);

            // print staff
            System.out.println(staff);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}