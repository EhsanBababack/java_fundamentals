public class IsPrimitiveMethod {
    public static void main(String[] args) {
        Class c1=TestClass.class;

        Class c2=int.class;

        System.out.println(c1.isPrimitive());

        System.out.println(c2.isPrimitive());
    }
}
