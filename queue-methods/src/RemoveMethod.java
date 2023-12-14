import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class RemoveMethod {
    public static void main(String[] args) {

        Queue<String> queue1=new LinkedList<>(Arrays.asList("mehdi","ahmad","mohammad","reza","ali"));

        Queue<String> queue2=new PriorityQueue<>(Arrays.asList("mehdi","ahmad","mohammad","reza","ali"));

        System.out.println(queue1.remove());

        System.out.println(queue2.remove());
    }
}
