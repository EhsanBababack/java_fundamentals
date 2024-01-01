public class AppendMethod {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("My name is Ehsan.");
        sb1.append(" my name is mehdi.");
        sb1.append(100.);
        sb1.append("ali.");
        sb1.append(23.45);
        sb1.append(true);
        System.out.println(sb1);
    }
}
