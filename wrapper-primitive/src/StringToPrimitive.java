import java.util.Scanner;

public class StringToPrimitive {
    public static void main(String[] args) {
        System.out.println("please enter a number : ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = Integer.parseInt(s);
        System.out.println(i);
    }
}
