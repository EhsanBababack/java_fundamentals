import java.util.Arrays;

public class EqualsMethod {
    public static void main(String[] args) {
        int[] a = {23, 45, 76, 7, 56, 100, 87, 4, 200};

        int[] b = Arrays.copyOfRange(a, 0, a.length);

        System.out.println(Arrays.equals(a, b));
    }
}
