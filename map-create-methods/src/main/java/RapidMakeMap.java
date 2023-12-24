import java.util.TreeMap;

public class RapidMakeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tempMap = new TreeMap<Integer, String>() {{
            put(80, "Nastaran");
            put(35, "Fatemeh");
            put(32, "Zahra");
        }};
        System.out.println(tempMap);
    }
}
