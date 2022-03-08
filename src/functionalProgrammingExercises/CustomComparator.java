package functionalProgrammingExercises;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> intList = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> sort = (list) -> {
            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();
            for(int e : list) {
                if(e % 2 == 0) even.add(e);
                else odd.add(e);
            }
            Collections.sort(even);
            Collections.sort(odd);
            list.clear();
            list.addAll(even);
            list.addAll(odd);
            return list;
        };

        intList = sort.apply(intList);
        intList.forEach(e -> System.out.print(e + " "));
    }
}



//Condition

//Write a custom comparator that sorts all even numbers before all odd ones in ascending order. Pass it to an Arrays.sort()
//function and checkUp the result.



//Tests

//11 3 16 8 15 4 20 18
//4 8 16 18 20 3 11 15

//1 2 3 4 5 6
//2 4 6 1 3 5
