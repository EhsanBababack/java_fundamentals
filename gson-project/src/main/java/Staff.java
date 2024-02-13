import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Staff {
    private String name;
    private int age;
    private String[] position; // array
    private List<String> skills; // list
    @Expose
    private Map<String, BigDecimal> salary; // map
    //getters and setters

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position=" + Arrays.toString(position) +
                ", skills=" + skills +
                ", salary=" + salary +
                '}';
    }
}