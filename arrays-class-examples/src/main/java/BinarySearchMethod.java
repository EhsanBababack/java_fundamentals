import java.util.Arrays;

public class BinarySearchMethod {
    public static void main(String[] args) {

        int[] a = {23, 45, 76, 7, 56, 100, 87, 4, 200};

        Arrays.sort(a);

        System.out.println(Arrays.binarySearch(a, 100));
    }
}
