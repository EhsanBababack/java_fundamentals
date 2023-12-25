import java.util.Scanner;

public class ExceptionInMethod {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter Number : ");
            int num1 = reader.nextInt();
            Scanner reader2 = new Scanner(System.in);
            System.out.print("Enter Number : ");
            int num2 = reader2.nextInt();
            if (num2 == 0) {
                throw new ArithmeticException();
            } else {
                int result = num1 / num2;
                System.out.println(result);
            }

        } catch (ArithmeticException e) {
            System.out.println("Error :  " + e.getMessage());
        }
    }
}
