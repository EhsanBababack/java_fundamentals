import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {
    public static void main(String[] args) {
        String [] countries = {"India", "Switzerland", "Italy"};

        Set<String> set = new HashSet<String>(Arrays.asList(countries));
        System.out.println(set);
    }
}
