import java.lang.reflect.Method;

public class GetDeclaredMethodsMethod {
    public static void main(String[] args) {
        Class c1=TestClass.class;

        Method[] methods= c1.getDeclaredMethods();

        for (Method method : methods){

            System.out.print(method.getName()+"\t");

        }
    }
}
