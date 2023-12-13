import java.util.ArrayList;
import java.util.List;

public class SetMethod {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();

        list1.add("mehdi");

        list1.add("reza");

        list1.set(1,"aaaaaaaaaa");

        System.out.println(list1.get(1));
    }
}
