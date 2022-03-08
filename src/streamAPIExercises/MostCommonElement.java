package streamAPIExercises;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> list = Arrays
                .stream(input.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        list = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getKey))
                .map(Map.Entry::getValue)
                .get();

        list.forEach(num -> System.out.print(num + " "));
    }
}



//Условие

//На един ред, е даден е списък с цели числа, които са разделени с интервал. Без да променяте списъка, или да използвате допълнителни
//списъци, определете кое число в този списък се среща най-често. Принтирайте резулта.

//Ако има няколко различни най-често срещани числа, отпечатайте всяко едно от тях, като ги разделите с интервал.



//Тестове

//1 2 3 3 3 4 4 4 5 5 6 7
//3 4

//2 4 18 4 3 15 3 12 3 7
//3

//2 4 6 8
//2 4 6 8

//3 3 3 3
//3
