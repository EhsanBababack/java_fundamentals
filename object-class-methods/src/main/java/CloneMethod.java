public class CloneMethod {
    public static void main(String[] args) {
        Test test1 = new Test("Ehsan","Bababack",31);
        try {
            Test test2 = (Test)test1.clone();
            System.out.println(test2.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(test1.toString());

    }
}
