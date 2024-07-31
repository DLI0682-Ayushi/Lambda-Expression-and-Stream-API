interface FunctionalInterface {
    int addition(int a, int b);
}
public class FunctionalInterfaceImplementation {
    public static void main(String[] args) {
    FunctionalInterface sum = (a,b) -> a + b;
    int result = sum.addition(1, 2);
    System.out.println(result);
    }
}
