import java.util.HashMap;

public class ReplaceMethod {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(1,"Mehdi");

        hashMap.put(2,"Ahmad");

        hashMap.replace(2,"Ahmad","Ahmad Reza");

        System.out.println(hashMap);
    }
}
