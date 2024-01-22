import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {
        int[] a={23,45,11,5,56,7,56,100,87,4,200};

        Arrays.sort(a);

        for (int item :a){

            System.out.print(item+"\t");

        }
    }
}
