import java.lang.reflect.Field;

public class GetDeclaredFieldsMethod {
    public static void main(String[] args) {
        Class c1 = TestClass.class;

        Field[] fields = c1.getDeclaredFields();

        for (Field field : fields) {
            System.out.print(field.getName() + "\t");
        }
    }
}
