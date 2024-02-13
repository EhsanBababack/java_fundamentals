import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonParserToObject {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // JSON file to Java object
            Staff staff = mapper.readValue(new File("./staff.json"), Staff.class);
            // JSON string to Java object
            String jsonInString = "{\"age\":38,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000},\"custom_name\":\"modernISC\"}";
            Staff staff2 = mapper.readValue(jsonInString, Staff.class);
            // compact print
            System.out.println(staff2);
            // pretty print
            String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff2);
            String Staff2 = mapper.writeValueAsString(staff2);
            System.out.println(prettyStaff1);
            System.out.println(Staff2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}