import java.util.Arrays;
import java.util.LinkedList;

public class AddFirstMethod {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>(Arrays.asList("mehdi","ahmad","negin","zahra","mehran"));

        linkedList.addFirst("narges");

        System.out.println(linkedList);
    }
}
