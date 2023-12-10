import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String[] splitedItem = "Java1Html2Css3Javascript".split("\\d");
        for (String items : splitedItem){
            System.out.println(items);
        }
    }
}
