import java.util.HashMap;

public class ClearMethod {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Mehdi");

        hashMap.put(2, "Ahmad");

        hashMap.put(9, "Reza");

        hashMap.clear();

        System.out.println(hashMap.isEmpty());
    }
}
