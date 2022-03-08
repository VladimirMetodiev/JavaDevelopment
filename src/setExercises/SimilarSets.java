package setExercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class SimilarSets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int one = Integer.parseInt(input.nextLine());
        Set<Integer> theFirst = Arrays
                .stream(input.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        int two = Integer.parseInt(input.nextLine());
        Set<Integer> theSecond = Arrays
                .stream(input.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        HashSet<Integer> intersect;

        if(one <= two) {
            intersect = new HashSet<>(theSecond);
            intersect.retainAll(theFirst);
            System.out.println(intersect.size() == theFirst.size() ? "YES" : "NO");
        }
        else {
            intersect = new HashSet<>(theFirst);
            intersect.retainAll(theSecond);
            System.out.println(intersect.size() == theSecond.size() ? "YES" : "NO");
        }
    }
}



//Условие

//Нека наречем два масива (списъка) подобни, ако всички стойности на елементите от единия се съдържат в другия.
//Проверете дали дадените два масива (списъка) са подобни или не са.

//Входни данни
//Първият ред съдържа числото N (1 <= N <= 100000) – размера на първия масив;
//Вторият ред съдържа N цели числа, ненадвишаващи 10^9 по абсолютна стойност - елементите на масива;
//Третият ред съдържа числото M (1 <= M <= 100000) – размера на втория масив;
//Четвъртият ред съдържа M цели числа, ненадвишаващи 10^9 по абсолютна стойност - елементите на втория масив;

//Изход
//Програмата трябва да принтира думата YES, ако масивите (списъците) са подобни, или думата NO в противоположният случай.



//Тестове

//4
//10 8 15 5
//8
//5 15 9 6 11 8 10 7
//YES

//4
//3 8 4 1
//6
//1 7 2 6 3 5
//NO

//4
//2 3 1 5
//4
//2 3 1 4
//NO

//3
//15 20 10
//3
//10 20 15
//YES

//5
//8 1 2 10 4
//8
//1 7 2 5 3 4 8 6
//NO

//8
//1 7 2 5 3 4 8 6
//5
//8 1 2 10 4
//NO

//5
//8 1 2 10 4
//9
//1 7 2 10 5 3 4 8 6
//YES

//9
//1 7 2 10 5 3 4 8 6
//5
//8 1 2 10 4
//YES

//4
//5 10 8 6
//7
//5 19 6 5 10 8 5
//YES

//4
//1 2 2 3
//5
//1 2 3 3 3
//YES
