import java.util.HashSet;
import java.util.Set;

public class SetToArray {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // adding elements to our set
        set.add("Switzerland");
        set.add("Land of Java Tutorial");
        set.add("Array Example");

        // Converting our set to Array
        String[] arrayString = set.toArray(new String[set.size()]);
        for(String s: arrayString){
            // printing the contents of our array
            System.out.println(s);
        }

    }

}