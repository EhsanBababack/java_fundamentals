import java.util.ArrayList;
import java.util.List;

public class SubListMethod {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();

        list1.add("mehdi");

        list1.add("ahmad");

        list1.add("mohammad");

        list1.add("negin");

        list1.add("zahra");


        System.out.println(list1.subList(2,5));
        List<String> list = list1.subList(2, 5);
        System.out.println(list);
    }
}
