import java.util.Arrays;
import java.util.List;

public class MapAndReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 8, 3, 10, 7, 4);
        int sumOfEvenSquares = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println("Sum of squares of even numbers: " + sumOfEvenSquares);
    }
}
