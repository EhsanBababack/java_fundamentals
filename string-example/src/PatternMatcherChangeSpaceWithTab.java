import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherChangeSpaceWithTab {
    public static final String EXAMPLE_TEST = "This is my smal example string which I'm going to use for pattern matching.";

    public static void main(String[] args) {
        // Now create a new pattern and matcher to replace whitespace with tabs
        Pattern replace = Pattern.compile("\\s+");
        Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
        System.out.println(matcher2.replaceAll("\t "));
    }
}
