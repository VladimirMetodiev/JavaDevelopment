package arrayExercises;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = input.nextLine().split("\\s+");
        int length = array.length - 1;
        String current;

        for (int a = 0; a < array.length / 2; a++) {
            current = array[a];
            array[a] = array[length - a];
            array[length - a] = current;
        }

        System.out.println(String.join(" ", array));

//        for(String item : array){
//            System.out.print(item + " ");
//        }
    }
}



//Tests

//Facebook Twitter YouTube Instagram LinkedIn

//watermelon kiwi lime avocado papaya date

//vegetable
