import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {

        String[] countries = {"India", "Switzerland", "Italy", "France"};
        List list = new ArrayList(Arrays.asList(countries));
        System.out.println("ArrayList of Countries:" + list);

    }
}
