import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>();

        list1.add(23);

        list1.add(2000);

        list1.add(450);

        list1.add(89);

        list1.add(148);


        Iterator<Integer> iterator=list1.iterator();

        while (iterator.hasNext()){

            System.out.print(iterator.next()+" ");

        }

    }
}
