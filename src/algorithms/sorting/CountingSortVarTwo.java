package algorithms.sorting;

import algorithms.Support;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSortVarTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integers in the array separated by a space:");
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        array = countingSortSmart(array);
        Support.printTheArray(array);
    }

    public static int[] countingSortSmart(int[] array) {
        int max = array[0], min = array[0], counter = 0;

        for (int a = 1; a < array.length; a++) {
            if(array[a] > max) max = array[a];
            if(array[a] < min) min = array[a];
        }

        int range = max - min + 1;
        int[] temporary = new int[range];

        for (int b = 0; b < array.length; b++) {
            if(array[b] == 0) temporary[Math.abs(min)] += 1;
            else temporary[array[b] - min] += 1;
        }

        for (int e = 0; e < temporary.length; e++) {
            if(temporary[e] > 0) {
                for (int f = 0; f < temporary[e]; f++) {
                    array[counter] = e + min;
                    counter++;
                }
            }
        }

        return array;
    }
}



//Counting Sort - Сортиране чрез броене



//Тестове

//3 1 2
//1 2 3

//10 101 13 0 62 14 1 27 49 8
//0 1 8 10 13 14 27 49 62 101

//29 8 88 49 64 71 2 89 46 64 77
//2 8 29 46 49 64 64 71 77 88 89

//39 21 13 12 60 11 40 41 59 98 2 90 11 85 2
//2 2 11 11 12 13 21 39 40 41 59 60 85 90 98

//10 66 78 56 30 89 67 27 78 8 27 57 78 20 27 31
//8 10 20 27 27 27 30 31 56 57 66 67 78 78 78 89

//1 1 0 1 0 0 1 0 1
//0 0 0 0 1 1 1 1 1

//26 1 39 -15 8 25 -4 19 30 -8 25 -4
//-15 -8 -4 -4 1 8 19 25 25 26 30 39

//24 2 58 80 59 -70 31 75 -70 94 99 48 24 71 43 72 -11 16 2 -45
//

//79 33 -22 84 52 79 87 99 10 4 -41 56 79 48 21 -44 68 79 19 71 99 10 36 79 26
//-44 -41 -22 4 10 10 19 21 26 33 36 48 52 56 68 71 79 79 79 79 79 84 87 99 99

//1 -1 0 1 1 0 -1 0 -1 1 1 0 1 -1
//-1 -1 -1 -1 0 0 0 0 1 1 1 1 1 1



//Бележки по имплементацията на Counting sort алгоритъм, сортиращ както положителни, така и отрицателни цели числа:

//Values:   6 10 -3 0 8 -5 7 10 8

//Indexes:  0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15
//Values:  -5    -3        0                   6   7   8      10
//Count:    1     1        1                   1   1   2       2

//Проблем при Counting sort алгоритъма, са отрицателните цели числа, защото не могат да бъдат използвани като индекси в масива;

//Получавам неподредено множество от числа;
//Първо откривам най-голямата (max) и най-малката (min) стойност в това множество;
//Те са ми необходими за да определя диапазона на множеството;
//Диапазона е равен на сумата от аболютните стойности на max, min и 1;
//Добавям 1 за да включа в диапазона и нулата;
//Създавам помощен масив с големина равна на диапазона, в него ще разполагам стойностите от множеството;
//Отрицателните стойности, разполагам в клетките с индекси от 0 до Math.abs(min) - 1;
//Нулата (ако има такава) е в клетка с индекс Math.abs(min);
//Положителните стойности, разполагам в клетките с индекси от Math.abs(min) + 1 до Math.abs(min) + max - 1;
//Накрая преминавам през помощният масив и проверявам за стойности по-големи от нула, ако открия такива, преобразувам индекса и го
//принтирам толкова пъти, колкото е стойността на клетката;
