import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterateOnArrays {
    public static void main(String[] args) {
        String[] names = {"amir", "ahmad", "reza", "ali", "mehdi"};

        List<String> list2 = Arrays.asList(names);


        Iterator iterator2 = list2.iterator();

        while (iterator2.hasNext()) {

            System.out.print(iterator2.next() + " ");

        }
    }
}
