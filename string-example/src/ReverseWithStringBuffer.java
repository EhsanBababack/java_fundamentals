import java.util.Scanner;

public class ReverseWithStringBuffer {
    public static void main(String[] args) {
        System.out.println("please enter your text : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(reverseText(input));
    }
    public static String reverseText(String text){
        StringBuffer sb = new StringBuffer();
        for (int i = text.length()-1 ; i>=0 ; i--){
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }
}
