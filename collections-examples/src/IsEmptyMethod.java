import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class IsEmptyMethod {
    public static void main(String[] args) {
        Collection<Integer> list1=new ArrayList<>(Arrays.asList(23,45,23,6,78,9345,34,4676,4));

        System.out.println(list1.isEmpty());
    }
}
