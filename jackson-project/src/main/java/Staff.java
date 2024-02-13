import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Staff {
    @JsonProperty("custom_name")
    private String name;
    @Expose(serialize = false, deserialize = true)
    private int age;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String[] position; // Array
    private List<String> skills; // List
    private Map<String, BigDecimal> salary; // Map
}