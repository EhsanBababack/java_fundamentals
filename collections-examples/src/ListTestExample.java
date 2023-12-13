import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListTestExample {
    public static void main(String[] args) {
        List<String> list =  new ArrayList<>();
        list.add("Ehsan");
        list.add("Amir");
        list.add("Sara");
        list.add("Ali");
        showList(list);
        for (String s:list) {
            System.out.println(s);
        }



    }
    public static void showList(List list){
        System.out.println(list);
    }
}
