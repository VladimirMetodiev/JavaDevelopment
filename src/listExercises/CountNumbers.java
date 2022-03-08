package listExercises;

import java.util.*;
import java.util.stream.Collectors;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> source = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        TreeSet<Integer> keys = new TreeSet<>(source);
        LinkedHashMap<Integer, Integer> statistics = new LinkedHashMap<>();
        int counter = 0;

        Iterator<Integer> iterator = keys.iterator();

        while (iterator.hasNext()) {
            int currentKey = iterator.next();
            for(int n : source) {
                if(currentKey == n) counter++;
            }
            statistics.put(currentKey, counter);
            counter = 0;
        }

        for(Map.Entry<Integer, Integer> entry : statistics.entrySet()) {
            System.out.printf("%d -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}



//Condition

//Read a list of integers in range [0…1000] and print them in ascending order along with their number of occurrences.



//Tests

//Input
//8 2 2 8 2 2 3 7
//Output
//2 -> 4
//3 -> 1
//7 -> 1
//8 -> 2


//Input
//10 8 8 10 10
//Output
//8 -> 2
//10 -> 3


//Input
//60 13 50 19 21 72 100 19 13 64 14 19 19 33 15 100 13 64 19 21 26 19 60 100 14
//Output
//13 -> 3
//14 -> 2
//15 -> 1
//19 -> 6
//21 -> 2
//26 -> 1
//33 -> 1
//50 -> 1
//60 -> 2
//64 -> 2
//72 -> 1
//100 -> 3
