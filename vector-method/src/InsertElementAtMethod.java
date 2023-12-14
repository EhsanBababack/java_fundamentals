import java.util.Arrays;
import java.util.Vector;

public class InsertElementAtMethod {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>(Arrays.asList("mehdi","ahmad","negin","zahra","mehran"));

        vector.insertElementAt("narges",3);

        System.out.println(vector);
    }
}
