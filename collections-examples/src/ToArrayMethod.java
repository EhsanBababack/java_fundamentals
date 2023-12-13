import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class ToArrayMethod {
    public static void main(String[] args) {
        Collection<String> set=new HashSet<>(Arrays.asList("mehdi","ahmad","mohammad","reza","sara"));

        Object[] names= set.toArray();

        for(Object name:names){

            System.out.print(name+"\t");

        }
    }
}
