package algorithmsExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ApproximatelyBinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = Integer.parseInt(input.nextLine().trim());

        int[] one = new int[n];
        int[] two = new int[k];

        for (int a = 0; a < n; a++) one[a] = input.nextInt();
        for (int b = 0; b < k; b++) two[b] = input.nextInt();

        for (int e = 0; e < k; e++) {
            System.out.println(one[approximatelyBinarySearch(one, two[e])]);
        }
    }

    public static int approximatelyBinarySearch(int[] array, int number) {
        int start = 0, end = array.length - 1, middlePoint;
        int difference = Integer.MAX_VALUE, index = Integer.MAX_VALUE;

        while(start <= end) {
            middlePoint = (start + end) / 2;

            if(array[middlePoint] - number == 0) {
                return middlePoint;
            }
            else if(array[middlePoint] - number < 0) {
                if(Math.abs(array[middlePoint] - number) == difference) {
                    if(middlePoint < index) index = middlePoint;
                }
                if(Math.abs(array[middlePoint] - number) < difference) {
                    difference = Math.abs(array[middlePoint] - number);
                    index = middlePoint;
                }
                start = middlePoint + 1;
            }
            else {
                if(Math.abs(array[middlePoint] - number) < difference) {
                    difference = Math.abs(array[middlePoint] - number);
                    index = middlePoint;
                }
                end = middlePoint - 1;
            }
        }

        return index;
    }
}



//Реализирайте алгоритъм за "приблизително" двоично търсене.

//Входни данни
//Първият ред на входа съдържа две естествени числа N и K (0 < N, K < 100001).
//Вторият ред съдържа N числа от първия масив, сортирани в ненамаляващ ред.
//Третият ред съдържа K числа от втория масив.
//Всяко число в двата масива, по абсолютна стойност не надвишава 2*10^9

//Изход
//За всяко от K числата, отпечатайте числото от първият масив, което е най-близко до даденото число (на отделен ред). Ако има няколко
//такива числа, отпечатайте най-малкото от тях.



//Тестове

//Input
//5 5
//1 3 5 7 9
//2 4 8 1 6
//Output
//1
//3
//7
//1
//5

//14 1
//1 2 4 6 8 10 12 14 16 18 20 22 24 26
//25
//24

//14 1
//1 2 4 6 8 10 12 14 16 18 20 22 24 26
//-5
//1

//14 1
//1 2 4 6 8 10 12 14 16 18 20 22 24 26
//30
//26

//14 1
//1 2 4 6 8 10 12 14 16 18 20 22 24 26
//1
//1

//13 1
//1 2 4 6 8 10 12 14 16 18 20 22 24
//19
//18




//Друг вариант на същото решение

//public class ApproximatelyBinarySearch {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        input.nextLine();
//
//        int[] one = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        int[] two = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//
//        Arrays.stream(two).map(x -> one[approximatelyBinarySearch(one, x)]).forEach(System.out::println);
//    }
//
//    public static int approximatelyBinarySearch(int[] array, int number) {
//        int start = 0, end = array.length - 1, middlePoint;
//        int difference = Integer.MAX_VALUE, index = Integer.MAX_VALUE;
//
//        while(start <= end) {
//            middlePoint = (start + end) / 2;
//
//            if(array[middlePoint] - number == 0) {
//                return middlePoint;
//            }
//            else if(array[middlePoint] - number < 0) {
//                if(Math.abs(array[middlePoint] - number) == difference) {
//                    if(middlePoint < index) index = middlePoint;
//                }
//                if(Math.abs(array[middlePoint] - number) < difference) {
//                    difference = Math.abs(array[middlePoint] - number);
//                    index = middlePoint;
//                }
//                start = middlePoint + 1;
//            }
//            else {
//                if(Math.abs(array[middlePoint] - number) < difference) {
//                    difference = Math.abs(array[middlePoint] - number);
//                    index = middlePoint;
//                }
//                end = middlePoint - 1;
//            }
//        }
//
//        return index;
//    }
//}
