import java.util.Properties;

public class SetPropertyMethod {
    public static void main(String[] args) {
        Properties properties= System.getProperties();

        properties.setProperty("os.name","Linux");

        System.out.println(properties.getProperty("os.name"));
    }
}
