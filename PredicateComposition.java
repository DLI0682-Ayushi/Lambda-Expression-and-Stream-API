import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateComposition {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "hello world",
                "goodbye",
                "hello there",
                "how are you",
                "hi"
        );
        Predicate<String> lengthGreaterThan5 = s -> s.length() > 5;
        Predicate<String> containsHello = s -> s.contains("hello");
        Predicate<String> combinedPredicate = lengthGreaterThan5.and(containsHello);
        List<String> filteredStrings = strings.stream()
                .filter(combinedPredicate)
                .toList();
        System.out.println("Filtered strings:");
        filteredStrings.forEach(System.out::println);
    }
}

