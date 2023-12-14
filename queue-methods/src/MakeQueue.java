import java.util.*;

public class MakeQueue {
    public static void main(String[] args) {
        Queue<String> queue1=new LinkedList<>(Arrays.asList("mehdi","ahmad","mohammad","reza","ali"));

        Queue<String> queue2=new PriorityQueue<>(Arrays.asList("mehdi","ahmad","mohammad","reza","ali"));

        Queue<String> queue3=new ArrayDeque<>(Arrays.asList("mehdi","ahmad","mohammad","reza","ali"));


        System.out.println(queue1);

        System.out.println(queue2);

        System.out.println(queue3);
    }
}