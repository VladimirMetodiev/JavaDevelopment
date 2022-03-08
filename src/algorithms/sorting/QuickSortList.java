package algorithms.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static algorithms.Support.printTheList;

public class QuickSortList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integers in the list separated by a space:");
        List<Integer> list = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        quickSort(list, 0, list.size() - 1);
        printTheList(list);
    }

    private static void quickSort(List<Integer> list, int left, int right) {
        if (left < right) {
            int pivot = list.get(right);
            int index = (left - 1);

            for (int a = left; a < right; a++) {
                if (list.get(a) <= pivot) {
                    index++;
                    int temporary = list.get(index);
                    list.set(index, list.get(a));
                    list.set(a, temporary);
                }
            }

            int temporary  = list.get(index + 1);
            list.set(index + 1, list.get(right));
            list.set(right, temporary);

            quickSort(list, left, index);
            quickSort(list, index + 1, right);
        }
    }
}


//Quick sort - Бързо сортиране



//Тестове

//41 24 67 76 45
//24 41 45 67 76

//98 84 13 6 7 77
//6 7 13 77 84 98

//90 76 18 54 1 100 54 96 27 52 83 57 24 83 89
//1 18 24 27 52 54 54 57 76 83 83 89 90 96 100

//50 13 100 63 15 85 87 43 70 64 33 55 85 -21 80 -30 24 1 -6 87
//-30 -21 -6 1 13 15 24 33 43 50 55 63 64 70 80 85 85 87 87 100
