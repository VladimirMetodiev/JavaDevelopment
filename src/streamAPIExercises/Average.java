package streamAPIExercises;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        int num;

        while((num = input.nextInt()) != 0) {
            numbers.add(num);
        }

        numbers.stream()
                .mapToInt(x -> x)
                .average()
                .ifPresent(x -> System.out.println(new DecimalFormat("0.##############").format(x)));
    }
}



//Условие

//Определете средноаритметичната стойност на елементите на последователност от естествени числа, която завършва с числото 0.
//Числото 0 не се включва в стойностите, за изчисляването на средноаритметичната.
//Числата след нула (ако има такива) не е необходимо да се четат.

//Входни данни
//Дадена е последователност от цели числа. Въвеждането приключва, когато бъде получено числото 0.

//Изход
//Извежда се едно число - средноаритметичната стойност на елементите на последователноста.
//Ако изходната стойност няма дробна част, тя се принтира без десетична точка, но ако е дробно число,
//то тагава се принтира, такова каквото е.



//Тестове

//Input
//18 20 18 20 0
//Output
//19


//Input
//1
//5
//6
//0
//Output
//4


//Input
//34 18 16 98 76 24 61 0
//Output
//46,71428571428572


//Input
//29
//8
//14
//0
//Output
//17


//Input
//12 13 15 15 16 16 16 17 17 0
//Output
//15,22222222222222

