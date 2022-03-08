package functionalProgramming;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    /*
     * Пакетът java.util.function съдържа готови функционални интерфейси
     * Predicate<T> boolean test(T t);
     * Supplier<T> T get();
     * Consumer<T> void accept(T t);
     * Function<T, R> R apply(T t);
     */
    public static void main(String[] args) {
        Supplier<String> message = () -> "Example of a functional interface";
        Supplier<Integer> getNum = () -> 2;



        System.out.println(message.get());
        ArrayList<Integer> someList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        Predicate<Integer> checkUp = a -> a % 2 == 0;

        for (int b = 0; b < someList.size(); b++) {
            if (checkUp.test(someList.get(b))) someList.set(b, someList.get(b) + getNum.get());
        }

        someList.removeIf(checkUp.negate());        // Predicate има метод .negate(), който проверява дали обекта е противоположен на условието

        someList.forEach(el -> System.out.print(el + " "));
        System.out.println("\n");



        System.out.println(message.get());
        ArrayList<Integer> otherList = new ArrayList<>(Arrays.asList(1, -82, -6, 44, 3, -111, 17, -58, 9, 81, 11, 10));
        Consumer<ArrayList<Integer>> filterList = al -> al.stream().filter(x -> x > 0 && x <= 10).forEach(el -> System.out.print(el + " "));
        filterList.accept(otherList);
        System.out.println("\n");



        System.out.println(message.get());
        ArrayList<Integer> anotherList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        Consumer<ArrayList<Integer>> replaceNum = r -> r.replaceAll(x -> (x % 2 != 0) ? 1 : 0);
        replaceNum.accept(anotherList);
        anotherList.forEach(el -> System.out.print(el + " "));
        System.out.println("\n");



        System.out.println("Another example about Interface Consumer");
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        num.forEach(el -> {el *= 1000; System.out.print(el + " ");});
        System.out.println();
        num.forEach(element -> System.out.print(element + " "));
        System.out.println("\n");



        /*
         * Interface Function<T,​R>
         *
         * Type Parameters:
         * T - the type of the input to the function
         * R - the type of the result of the function
         */

        System.out.println(message.get());
        ArrayList<Double> realNumbers = new ArrayList<>(Arrays.asList(4.5, 5.5, 6.0, 4.9, 5.0, 5.25, 3.75, 4.8, 5.2, 5.8));
        Function<ArrayList<Double>, String> average = arrList -> {
            DecimalFormat df = new DecimalFormat("0.##");
            double result = 0.0;
            for(double r : arrList) result += r;
            return df.format(result / arrList.size());
        };
        System.out.println("Average: " + average.apply(realNumbers) + "\n");

    }
}
