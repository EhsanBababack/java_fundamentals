public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        }
        catch (NullPointerException e ){
            System.out.println("Error  :" + e.getMessage());

        }
        finally {
            System.out.println("The End…");
        }
    }
}
