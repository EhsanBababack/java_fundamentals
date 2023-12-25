public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try{
            int [] a = new int[4];
            a[10] = 90;
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Error  :" + e.getMessage());

        }
        finally {
            System.out.println("The End …");
        }

    }
}
