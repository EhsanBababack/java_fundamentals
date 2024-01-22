import java.util.Arrays;

public class FillMethod {
    public static void main(String[] args) {
        int[] b = new int[5];

        Arrays.fill(b, 8);

        for (int item : b) {

            System.out.print(item + "\t");

        }
    }
}
