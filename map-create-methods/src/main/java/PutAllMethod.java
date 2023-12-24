import java.util.HashMap;
import java.util.TreeMap;

public class PutAllMethod {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(1,"Mehdi");

        hashMap.put(2,"Ahmad");

        TreeMap<Integer,String> treeMap=new TreeMap<>();

        treeMap.put(21,"Sara");

        treeMap.put(4,"Narges");

        hashMap.putAll(treeMap);

        System.out.println(hashMap);
    }
}
