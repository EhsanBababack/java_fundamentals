public class ArithmeticExeptionExample {
    public static void main(String[] args) {
        try {
            int num1 = 24;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error  :" + e.getMessage());

        } finally {
            System.out.println("The End…");
        }
    }
}
