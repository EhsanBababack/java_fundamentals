import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortStringArray {
    public static void main(String[] args) {
        String[] countries = {"India", "Switzerland", "Italy", "France" ,"Switzerland", "Italy", "France" ,"Iran"};
        Set<String> set = new HashSet<String>(Arrays.asList(countries));
        System.out.println(set);
        String[] arrayString = set.toArray(new String[set.size()]);
        for(String s: arrayString){
            System.out.print(s + "  ");
        }
    }
}
