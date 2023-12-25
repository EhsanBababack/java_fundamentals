import java.util.Scanner;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number : ");
            String str = scanner.nextLine();
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Error  : " + e.getMessage());

        } finally {
            System.out.println("The End…");
        }
    }
}
