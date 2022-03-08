package listExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingRightOrLeft {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        List<Integer> list = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int shift = Integer.parseInt(input.nextLine());

        if(Math.abs(shift) > list.size()) shift = resize(shift, list.size());

        if(shift > 0) {
            list.addAll(0, list.subList(list.size() - shift, list.size()));
            list.subList(list.size() - shift, list.size()).clear();
        }
        else {
            list.addAll(list.subList(0, Math.abs(shift)));
            list.subList(0, Math.abs(shift)).clear();
        }

        list.forEach(num -> System.out.print(num + " "));
    }

    private static int resize(int shift, int listSize) {
        if(shift > 0) {
            while(shift > listSize) shift -= listSize;
        }
        else {
            while(Math.abs(shift) > listSize) shift += listSize;
        }
        return shift;
    }
}



//Условие

//Получавате списък от N цели числа (1 <= N <= 100000), разделени с интервал и числото K ( |K| < 100000). Циклически преместете
//числата от списъка на |K| елемента вдясно, ако K е положителено число, или вляво, ако е отрицателно.

//Входни данни
//На първи ред, получавате списък с цели числа, разделени с интервал;
//На втори ред, получавате числото K;

//Изход
//Отпечатайте отговора на проблема, т.е. списъкът.

//Забележка
//Решението трябва да има сложност O(N), т.е. не трябва да зависи от K. Не може да се използва допълнителен списък.



//Тестове

//2 4 6 8 10
//-4
//10 2 4 6 8

//5 3 7 4 6
//3
//7 4 6 5 3

//19 49 21 53 -6 72 14 68
//-5
//72 14 68 19 49 21 53 -6

//3 6 9 12
//5
//12 3 6 9
