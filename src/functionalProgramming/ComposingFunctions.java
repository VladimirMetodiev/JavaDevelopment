package functionalProgramming;

import java.util.function.Function;

public class ComposingFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> adder = x -> x + 10;
        Function<Integer, Integer> multiplier = x -> x * 3;

        // compose: adder(multiplier(9)) - 9 * 3 + 10
        System.out.println("Result: " + adder.compose(multiplier).apply(9));

        // andThen: multiplier(adder(9)) - (9 + 10) * 3
        System.out.println("Result: " + adder.andThen(multiplier).apply(9));
    }
}
