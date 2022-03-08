package streamAPIExercises;

import java.util.*;
import java.util.stream.Collectors;

public class SwapMinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int min = Collections.min(list);
        int max = Collections.max(list);

        int indexOfMinimum = list.indexOf(min);
        int indexOfMaximum = list.indexOf(max);

        list.set(indexOfMinimum, max);
        list.set(indexOfMaximum, min);

        list.forEach(num -> System.out.print(num + " "));
    }
}



//Условие

//На един ред, получаваме списък с цели числа, като всички числа в списъка са различни. Разменете позициите на числата с
//минимална и максимална стойност. След това принтирайте целият списък.



//Тестове

//3 -4 10 26 8
//3 26 10 -4 8

//5 6 17 9 -5
//5 6 -5 9 17

//8 1 4 19 35
//8 35 4 19 1

//1 2 3 4 5
//5 2 3 4 1

//10 6 8 5 1
//1 6 8 5 10




