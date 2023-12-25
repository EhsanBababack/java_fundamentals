public class ToCharArrayMethod {
    public static void main(String[] args) {
        String str = "Hello, my name is Mehdi. I'm a teacher.";

        char charArray[] = str.toCharArray();

        for (char s : charArray) {

            System.out.print(s + " ");

        }
    }
}
