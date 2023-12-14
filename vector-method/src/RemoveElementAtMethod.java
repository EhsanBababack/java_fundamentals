import java.util.Arrays;
import java.util.Vector;

public class RemoveElementAtMethod {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(Arrays.asList("mehdi", "ahmad", "negin", "zahra", "mehran"));

        vector.removeElementAt(1);

        System.out.println(vector);
    }
}
