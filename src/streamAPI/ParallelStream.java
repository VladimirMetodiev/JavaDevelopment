package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] arguments) {
        int sum = IntStream.range(1, 100001).parallel().sum();      // сумира числата от [x; y) в случаят от 1 до 100000
        System.out.println("The sum is: " + sum);                           // The sum is: 705082704

        double average = IntStream.range(1, 100001).parallel().mapToDouble(e -> (double)e).average().getAsDouble();
        System.out.println("The average is: " + average);                   // The average is: 50000.5



        List<Integer> list = new ArrayList<>();

        for(int a = 1; a <= 100000; a++) list.add(a);

        list = list.parallelStream().map(x -> x * 2).collect(Collectors.toList());

        int counter = 0;

        for (int b = 0; b < list.size(); b++) {
            counter++;
            if(counter < 20) {
                System.out.print(list.get(b) + ", ");
            }
            else {
                System.out.println(list.get(b));
                counter = 0;
            }
        }
    }
}
