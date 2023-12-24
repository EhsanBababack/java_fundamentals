import java.util.HashMap;

public class PutMethod {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Mehdi");

        hashMap.put(9, "Reza");

        hashMap.put(2, "Ahmad");

        hashMap.put(null, "Mohammad");

        hashMap.put(11, null);

        hashMap.put(12, null);

        System.out.println(hashMap);
    }
}
