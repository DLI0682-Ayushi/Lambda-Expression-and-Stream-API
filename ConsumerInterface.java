import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "programming");
        Consumer<String> uppercasePrinter = s -> System.out.println(s.toUpperCase());
        strings.forEach(uppercasePrinter);
    }
}
