import java.util.Arrays;
import java.util.Stack;

public class PushMethod {
    public static void main(String[] args) {
        Stack<String> stack1=new Stack<>();

        stack1.addAll(Arrays.asList("mehdi","ahmad","negin","zahra","mehran"));

        stack1.push("narges");

        System.out.println(stack1);
    }
}
