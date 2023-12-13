import java.util.ArrayList;
import java.util.List;

public class IndexOfMethod {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();

        list1.add("mehdi");

        list1.add("ahmad");
        list1.add("ahmad");
        list1.add("ahmad");

        list1.add("mohammad");

        list1.add("ahmad");

        list1.add("negin");

        System.out.println(list1.indexOf("ahmad"));
    }
}
