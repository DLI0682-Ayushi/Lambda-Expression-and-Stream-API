interface SquareCalculator {
    double calculateSquare(double number);
    default void printResult(double number, double square) {
        System.out.printf("The square of %.2f is %.2f%n", number, square);
    }
}

public class CustomFunctionalInterface {
    public static void main(String[] args) {
        double inputNumber = 5.0;
        SquareCalculator calculator = number -> number * number;
        double square = calculator.calculateSquare(inputNumber);
        calculator.printResult(inputNumber, square);
    }
}

