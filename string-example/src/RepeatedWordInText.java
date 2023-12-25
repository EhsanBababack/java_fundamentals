import java.util.Scanner;

public class RepeatedWordInText {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            RepeatedWordInText repeatedWord = new RepeatedWordInText();
            System.out.println("Enter a String:");
            String str = input.nextLine();
            System.out.println("Enter a word:");
            String word = input.nextLine();
            System.out.println(repeatedWord.fineNumberRepeatedWords(str, word));
    }
    public static int fineNumberRepeatedWords(String text, String word) {
        int counter = 0;
        text = text.trim();
        word = word.trim();
        String str[] = text.split("\\s+");
        for (int i = 0; i < str.length; i++) {

            if (str[i].equals(word)) {
                counter++;
            }
        }
        if (counter > 0)
            return counter;
        else {
            System.err.println("not found !!!");
            return 0;
        }
    }
}

