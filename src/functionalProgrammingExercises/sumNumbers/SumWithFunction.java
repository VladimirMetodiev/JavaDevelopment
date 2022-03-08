package functionalProgrammingExercises.sumNumbers;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SumWithFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Function<int[], Integer> counts = (arr) -> arr.length;

        Function<int[], Integer> calculate = (arr) -> {
            int result = 0;
            for(int element : arr) result += element;
            return result;
        };

        int[] array = Arrays.stream(input.nextLine().split("\\s*,\\s+")).mapToInt(Integer::parseInt).toArray();
        int count = counts.apply(array);
        int sum = calculate.apply(array);

        System.out.printf("Count = %d%n", count);
        System.out.printf("Sum = %d%n", sum);
    }
}



//Function<InputType, OutputType> name = InputParameter -> ReturnExpression;
//Function<Integer, Integer> func = x -> x * x;
