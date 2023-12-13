import java.util.Arrays;
import java.util.LinkedList;

public class AddLastMethod {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>(Arrays.asList("mehdi","ahmad","negin","zahra","mehran"));

        linkedList.addLast("narges");

        System.out.println(linkedList);
    }
}
