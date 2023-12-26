import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAverage {
    public static void main(String[] args) {
        Arrays.stream(new int[] {1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);
    }
}
