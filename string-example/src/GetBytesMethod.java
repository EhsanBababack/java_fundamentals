public class GetBytesMethod {
    public static void main(String[] args) {
        String str = "Hello, my name is Mehdi. I'm a teacher.";

        byte[] bytes1 = str.getBytes();

        for (byte b : bytes1) {

            System.out.print(b + "-");

        }
    }
}
