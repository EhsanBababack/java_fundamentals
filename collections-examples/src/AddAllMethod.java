import java.util.*;

public class AddAllMethod {
    public static void main(String[] args) {
        Collection<Integer> list1=new ArrayList<>(Arrays.asList(23,45,23,6,78,9345,34,4676,4));

        Set<Integer> set1=new HashSet<>(Arrays.asList(3000,4000,5000));

        list1.addAll(set1);

        System.out.println(list1);
    }
}
