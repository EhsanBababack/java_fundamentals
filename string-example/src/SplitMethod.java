import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String[] splitedItem = "Java1Html2Css3Javascript".split("\\d");
        for (String items : splitedItem) {
            System.out.println(items);
        }
        System.out.println("-------------------------------------------------");
        String str = "Hello, my name is Mehdi. I'm a teacher.";
        String[] strArray = str.split(" ");
        for (String s : strArray) {
            System.out.print(s +" -");
        }
    }
}
