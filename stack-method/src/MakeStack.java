import java.util.Arrays;
import java.util.Stack;

public class MakeStack {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<>();

        stack1.addAll(Arrays.asList("mehdi", "ahmad", "negin", "zahra", "mehran"));
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());

        System.out.println(stack1);
    }
}
