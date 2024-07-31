public class BiFunction {
    public static void main(String[] args) {
        java.util.function.BiFunction<String, String, String> concatenateWithSpace = (s1, s2) -> s1 + " " + s2;

        String input1 = "Hello";
        String input2 = "World";

        String result = concatenateWithSpace.apply(input1, input2);

        System.out.println("Concatenated string: " + result);
    }
}
