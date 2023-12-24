import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortIntegerArray {
    public static void main(String[] args) {
        Integer[] numbers = {4,5,3,6,9,2,1,7,1,6,2,1,6,2,3,2,2,3,5,4,6,5,8,2,2,3,6,1,2,5,4,2,1,7};
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(numbers));
        Integer[] arrayInteger = set.toArray(new Integer[set.size()]);
        for(Integer s: arrayInteger){
            System.out.print(s + "  ");
        }
    }
}
