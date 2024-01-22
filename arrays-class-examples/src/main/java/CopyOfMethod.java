import java.util.Arrays;

public class CopyOfMethod {
    public static void main(String[] args) {
        int[] a = {23, 45, 76, 7, 56, 100, 87, 4, 200};

        int[] b = Arrays.copyOf(a, 20);

        for (int item : b) {

            System.out.print(item + "\t");

        }
    }
}
