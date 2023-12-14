import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PeekMethod {
    public static void main(String[] args) {
        Queue<String> queue1=new LinkedList<>(Arrays.asList("mehdi","ahmad","mohammad","reza","ali"));

        Queue<String> queue2=new PriorityQueue<>(Arrays.asList("mehdi","ahmad","mohammad","reza","ali"));

        System.out.println(queue1.peek());
        System.out.println(queue1);

        System.out.println(queue2.peek());
    }
}
