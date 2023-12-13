import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortMethod {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();

        list1.add("mehdi");

        list1.add("ahmad");

        list1.add("mohammad");

        list1.add("negin");

        list1.add("zahra");

        list1.sort(Comparator.reverseOrder());

        System.out.println(list1);
    }
}
