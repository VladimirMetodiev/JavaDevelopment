package algorithmsExercises;

import java.util.Arrays;
import java.util.Scanner;

public class LeftAndRightSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = Integer.parseInt(input.nextLine().trim());

        int[] one = new int[n];
        int[] two = new int[m];

        for (int a = 0; a < n; a++) one[a] = input.nextInt();
        for (int b = 0; b < m; b++) two[b] = input.nextInt();

        for (int e = 0; e < m; e++) {
            int theFirst = getTheFirst(one, two[e]);
            int theLast = getTheLast(one, two[e]);

            if (theFirst > -1 && theLast > -1) System.out.printf("%d %d%n", theFirst + 1, theLast + 1);
            else System.out.println(0);
        }
    }

    private static int binarySearch(int[] array, int number) {
        int start = 0, end = array.length - 1, middlePoint;

        while (start <= end) {
            middlePoint = (start + end) / 2;

            if (array[middlePoint] == number) {
                return middlePoint;
            }
            else if (array[middlePoint] < number) {
                start = middlePoint + 1;
            }
            else {
                end = middlePoint - 1;
            }
        }

        return -1;
    }

    private static int getTheFirst(int[] array, int number) {
        int index = -1, current;
        int[] arr = Arrays.copyOf(array, array.length);

        while ((current = binarySearch(arr, number)) > -1) {
            index = current;
            arr = Arrays.copyOf(arr, index);
        }

        return index;
    }

    private static int getTheLast(int[] array, int number) {
        int index = -1, current, length = array.length, difference = 0;
        int[] arr = Arrays.copyOf(array, length);

        while ((current = binarySearch(arr, number)) > -1) {
            index = current;
            difference += index + 1;
            length = length - index - 1;
            int[] currentArr = new int[length];
            System.arraycopy(arr, index + 1, currentArr, 0, currentArr.length);
            arr = Arrays.copyOf(currentArr, length);
        }

        return difference - 1;
    }
}



//Условие

//Дадени са два списъка с числа. Числата от първият списък са подредени във възходящ порядък. За всяко число от вторият списък,
//определете НОМЕРА на първото и последното появяване на това число в първия списък.

//Входни данни
//На първият ред се дават две числа N и M (1 < N, M < 20000);
//Вторият ред съдържа N цели числа, сортирани във възходящ порядък - елементите на първия списък;
//Третият ред съдържа M положителни, цели числа - елементите на втория списък;
//Всички числа в списъците са 32-битови, цели числа със знак.

//Изход
//Програмата трябва да изведе M реда;
//За всяко число от втория списък отпечатайте номера на първото и последното му появяване в първия списък;
//Номерирането започва от 1. Ако номерът не е включен в първия списък, трябва да отпечатате една 0;



//Тестове

//Input
//10 5
//1 1 3 3 5 7 9 18 18 57
//57 3 9 1 179
//Output
//10 10
//3 4
//7 7
//1 2
//0

//Input
//10 5
//1 3 3 5 5 5 7 9 18 57
//57 3 5 9 20
//Output
//10 10
//2 3
//4 6
//8 8
//0

//4 4
//5 5 5 5
//7 5 14 5
//0
//1 4
//0
//1 4



//Решение, което предполага, че има най-много по две еднакви числа

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int m = Integer.parseInt(input.nextLine().trim());
//
//        int[] one = new int[n];
//        int[] two = new int[m];
//
//        for (int a = 0; a < n; a++) one[a] = input.nextInt();
//        for (int b = 0; b < m; b++) two[b] = input.nextInt();
//
//        for (int index = 0; index < m; index++) {
//            int start = 0, end = one.length - 1, middlePoint, theFirst = -1, theSecond = -1;
//
//            while (start <= end) {
//                middlePoint = (start + end) / 2;
//
//                if (one[middlePoint] == two[index]) {
//                    if (middlePoint > 0 && one[middlePoint - 1] == two[index]) {
//                        theFirst = middlePoint - 1;
//                        theSecond = middlePoint;
//                    }
//                    else if (middlePoint < one.length - 1 && one[middlePoint + 1] == two[index]) {
//                        theFirst = middlePoint;
//                        theSecond = middlePoint + 1;
//                    }
//                    else {
//                        theFirst = middlePoint;
//                        theSecond = middlePoint;
//                    }
//                    break;
//                }
//                else if (one[middlePoint] < two[index]) {
//                    start = middlePoint + 1;
//                }
//                else {
//                    end = middlePoint - 1;
//                }
//            }
//
//            if (theFirst > -1 && theSecond > -1) {
//                System.out.printf("%d %d%n", theFirst + 1, theSecond + 1);
//            }
//            else {
//                System.out.println(0);
//            }
//        }
//    }
