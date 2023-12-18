import java.util.Properties;

public class GetPropertyMethod {
    public static void main(String[] args) {
        Properties properties = System.getProperties();

        System.out.println(properties.getProperty("os.name"));
    }
}
