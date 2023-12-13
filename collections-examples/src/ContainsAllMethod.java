import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ContainsAllMethod {
    public static void main(String[] args) {
        Collection<Integer> list1=new ArrayList<>(Arrays.asList(23,45,23,6,78,9345,34,4676,4));

        System.out.println(list1.containsAll(new ArrayList<>(Arrays.asList(23,6,78,4676,34))));
        System.out.println(list1.containsAll(new ArrayList<>(Arrays.asList(6,14,33,4676,8))));
    }
}
