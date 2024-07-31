import java.util.function.Function;

class CircleAreaCalculator implements Function<Float, Float> {
    @Override
    public Float apply(Float radius) {
        return (float) (Math.PI * radius * radius);
    }
}
public class FunctionInterface {
    public static void main(String[] args) {
        float radius = 5.0f;
        CircleAreaCalculator calculator = new CircleAreaCalculator();
        float area = calculator.apply(radius);
        System.out.printf("The area of a circle with radius %.2f is %.2f%n", radius, area);
    }
}
