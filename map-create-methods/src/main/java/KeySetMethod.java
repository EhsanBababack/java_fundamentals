import java.util.HashMap;
import java.util.Set;

public class KeySetMethod {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Mehdi");
        hashMap.put(2, "Ahmad");

        Set<Integer> integers = hashMap.keySet();
        System.out.println(integers);
    }
}
