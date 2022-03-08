package streamAPIExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheBiggestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> list = Arrays
                .stream(input.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int max = list.stream().max((x, y) -> x - y).get();

        System.out.printf("%d %d", max, list.indexOf(max));
    }
}



//Условие

//Даден е списък с цели числа (всички числа в списъка са на един ред). Принтирайте стойността на най-големият елемент в списъка,
//последван от индекса на този елемент в списъка. Ако има няколко най-големи елемента, отпечатайте индекса на първия от тях.



//Тестове

//12 34 2 -19 26 0 5
//34 1

//1 4 9 3 1 9
//9 2
