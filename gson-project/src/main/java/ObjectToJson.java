import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ObjectToJson {
    public static void main(String[] args) {
        // pretty print with '' .setPrettyPrinting() ''
        // You can serialize nulls fields  with   '' .serializeNulls() ''
        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        Staff staff = createStaffObject();
        // Java objects to String
        String json = gson.toJson(staff);
        //System.out.println(json);
        // Java objects to File
        try (FileWriter writer = new FileWriter("./staff.json")) {
            gson.toJson(staff, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Staff createStaffObject() {
        Staff staff = new Staff();
        staff.setName("modernISC");
        staff.setAge(35);
        staff.setPosition(new String[]{"Founder", "CTO", "Writer"});
        Map<String, BigDecimal> salary = new HashMap() {{
            put("2010", new BigDecimal(10000));
            put("2012", new BigDecimal(12000));
            put("2018", new BigDecimal(14000));
        }};
        staff.setSalary(null);
        staff.setSkills(Arrays.asList("java", "python", "node", "kotlin"));
        return staff;
    }
}