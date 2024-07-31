import java.util.List;
import java.util.Optional;

public class OptionalHandling {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 5, 8, 15, 3); 
        Optional<Integer> maxOptional = numbers.stream()
                .max(Integer::compareTo);
        if (maxOptional.isPresent()) {
            int maxValue = maxOptional.get();
            System.out.println("Maximum value: " + maxValue);
        } else {
            System.out.println("List is empty.");
        }
    }
}

