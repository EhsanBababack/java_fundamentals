import java.util.Arrays;

public class CopyOfMethodString {public static void main(String[] args) {
    String[] a = {"ALI", "REZA", "EHSAN", "MAHROKH", "SARA"};

    String[] b = Arrays.copyOf(a, 20);

    for (String item : b) {

        System.out.print(item + "\t");

    }
}
}
