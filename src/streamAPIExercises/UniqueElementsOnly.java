package streamAPIExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UniqueElementsOnly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> list = Arrays
                .stream(input.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        list.stream()
                .filter(num -> Collections.frequency(list, num) == 1)
                .collect(Collectors.toSet())
                .forEach(num -> System.out.print(num + " "));
    }
}



//Условие

//На един ред е даден списък от цели числа. Принтирайте само онези числа от списъка, които се появяват в него само веднъж.
//Принтираните елементи (числа), трябва да бъдат на един ред, разделени с интервал, в реда, в който се появяват в списъка.



//Тестове

//19 5 14 8 5 8
//19 14

//3 6 9
//3 6 9

//1 1 1
//
