import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethod {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();

        list1.add("mehdi");

        list1.add("ahmad");

        list1.add("mohammad");

        list1.add("negin");

        list1.add("zahra");

        ListIterator<String> iterator= list1.listIterator();

        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}
