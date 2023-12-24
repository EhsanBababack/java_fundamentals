import java.util.HashMap;

public class RemoveMethod {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(1,"Mehdi");

        hashMap.put(2,"Ahmad");

        hashMap.remove(1);

        System.out.println(hashMap);
    }
}
