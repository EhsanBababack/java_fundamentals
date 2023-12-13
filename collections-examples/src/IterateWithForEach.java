import java.util.ArrayList;
import java.util.List;

public class IterateWithForEach {
    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();

        list1.add(23);

        list1.add(2000);

        list1.add(450);

        list1.add(89);

        list1.add(148);


        list1.forEach(item -> System.out.println(item));
    }
}
