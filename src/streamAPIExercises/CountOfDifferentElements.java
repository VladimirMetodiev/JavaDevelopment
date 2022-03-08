package streamAPIExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class CountOfDifferentElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set<Integer> set = Arrays
                .stream(input.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        System.out.println(set.size());
    }
}



//Условие

//На един ред, е даден списък от цели числа, разделени с интервал. Пребройте колко различни елемента съдържа списъка.
//Принтирайте резултата.



//Тестове

//19 19 19
//1

//10 20 30 40 50
//5

//30 -16 2 4 -1 12 -16 2 5 0 4 12 -16 4 30 0 -1 30 2 5
//8
