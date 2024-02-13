import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JacksonParserToJson {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        Staff staff = createStaff();
        try {
            // Java objects to JSON file
            mapper.writeValue(new File("./staff.json"), staff);
            // Java objects to JSON string - compact-print
            String jsonString = mapper.writeValueAsString(staff);
            System.out.println(jsonString);
            // Java objects to JSON string - pretty-print
            String jsonInString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
            System.out.println(jsonInString2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static Staff createStaff() {
        Staff staff = new Staff();
        staff.setName("modernISC");
        staff.setAge(38);
        staff.setPosition(new String[]{"Founder", "CTO", "Writer"});
        Map<String, BigDecimal> salary = new HashMap() {{
            put("2010", new BigDecimal(10000));
            put("2012", new BigDecimal(12000));
            put("2018", new BigDecimal(14000));
        }};
        staff.setSalary(salary);
        staff.setSkills(Arrays.asList("java", "python", "node", "kotlin"));
        return staff;
    }
}