public class ReplaceAllExample {
    public static void main(String[] args) {
        String str ="java java java";
        System.out.println(str.replaceAll("v\\w", "wi"));
    }
}
