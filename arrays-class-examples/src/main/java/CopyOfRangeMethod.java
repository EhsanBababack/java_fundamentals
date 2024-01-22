import java.util.Arrays;

public class CopyOfRangeMethod {
    public static void main(String[] args) {
        int[] a = {23, 45, 76, 7, 56, 100, 87, 4, 200, 10};

        int[] b = Arrays.copyOfRange(a, 5, 20);

        for (int item : b) {

            System.out.print(item + "\t");

        }
    }
}
