import java.util.ArrayList;
import java.util.List;

public class ArrayListToArrays {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("India");
        list.add("Switzerland");
        list.add("Italy");
        list.add("France");

        String [] countries = list.toArray(new String[list.size()]);
        System.out.println(countries[2]);
    }
}
