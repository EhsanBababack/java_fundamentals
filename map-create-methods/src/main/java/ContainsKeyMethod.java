import java.util.HashMap;

public class ContainsKeyMethod {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(1,"Mehdi");

        hashMap.put(2,"Ahmad");

        System.out.println(hashMap.containsKey(18));
    }
}
