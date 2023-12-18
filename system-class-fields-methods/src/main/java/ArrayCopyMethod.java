public class ArrayCopyMethod {
    public static void main(String[] args) {
        Integer[] a = {2, 4, 6, 78, 79, 54, 3, 574, 765, 8, 54, 6};
        Integer[] b = new Integer[20];
        System.arraycopy(a, 2, b, 7, 7);

        for (int i = 0; i < b.length; i++) {

            System.out.print(b[i] + "\t");

        }
    }
}
