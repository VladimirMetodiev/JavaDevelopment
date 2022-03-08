package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import java.util.function.Function;
import java.util.stream.Collectors;

public class SimplestGroupingBy {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<String, List<Integer>> oddOrEven = list.stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "even" : "odd"));

        System.out.println("Even numbers are: " + oddOrEven.get("even"));
        System.out.println("Odd numbers are: " + oddOrEven.get("odd"));
        printLine();


        List<String> someColours = Arrays.asList("red", "green", "blue", "red", "black", "red", "blue", "white");
        Map<String, Long> colours = someColours.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        colours.entrySet()
                .stream()
                .sorted(Comparator.comparing(x -> x.getKey()))
                .forEach(x -> System.out.printf("%s:[%d]%n", x.getKey(), x.getValue()));
        printLine();


        List<Laptop> laptops = Arrays.asList(
                new Laptop("Apple", 10, 999.0),
                new Laptop("Acer", 20, 850.0),
                new Laptop("Dell", 10, 1500.0),
                new Laptop("Lenovo", 10, 1200.0),
                new Laptop("HP", 20, 750.0),
                new Laptop("Apple", 10, 999.0),
                new Laptop("Toshiba", 10, 800.0),
                new Laptop("Lenovo", 10, 1200.0),
                new Laptop("Apple", 20, 999.0),
                new Laptop("HP", 30, 750.0)
        );

        Map<String, Long> counting = laptops.stream().collect(Collectors.groupingBy(Laptop::getBrand, Collectors.counting()));

        counting.entrySet()
                .stream()
                .sorted(Comparator.comparing(x -> x.getKey()))
                .forEach(x -> System.out.printf("%s: %d batch(-es)%n", x.getKey(), x.getValue()));
        printLine();

        Map<String, Integer> sum = laptops.stream().collect(
                Collectors.groupingBy(Laptop::getBrand, Collectors.summingInt(Laptop::getQuantity)));

        sum.entrySet()
                .stream()
                .sorted(Comparator.comparing(x -> x.getValue()))
                .forEach(x -> System.out.printf("%s: %d pieces%n", x.getKey(), x.getValue()));
    }

    private static void printLine() {
        System.out.println("------------------------------");
    }
}

class Laptop {
    private String brand;
    private int quantity;
    private double price;

    public Laptop(String brand, int quantity, double price) {
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }
}