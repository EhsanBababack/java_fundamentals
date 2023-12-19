public class GetNameMethod {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        String name = testClass.getClass().getName();
        System.out.println(name);
        Class c1 = TestClass.class;
        System.out.println(c1.getName());

    }
}
