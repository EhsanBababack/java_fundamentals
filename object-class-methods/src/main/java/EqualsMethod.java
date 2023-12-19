public class EqualsMethod {
    public static void main(String[] args) {
        Test test1 = new Test("Ehsan", "Bababack", 31);
        Test test2 = new Test("Ali", "Razavi", 18);
        Test test3 = new Test("Ehsan", "Bababack", 31);
        if (test1.equals(test2)) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
        System.out.println("******************************************************************");
        if (test1.equals(test3)) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}
