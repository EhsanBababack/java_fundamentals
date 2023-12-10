import java.util.Scanner;

public class RegularExpressionExample {
    public static void main(String[] args) {
        System.out.println("please enter ... ");
        Scanner scanner = new Scanner(System.in);
        String sInput = scanner.nextLine();
        if (sInput.matches("[1-9]-[0-9]{2}")){
            System.out.println("Valid");
        }else {
            System.out.println("Not Valid");
        }
    }
}
