public class HashcodeMethod {
    public static void main(String[] args) {
        Test test1 = new Test("Ehsan", "Bababack", 31);
        Test test2 = new Test("Ali", "Razavi", 18);
        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());
    }
}
