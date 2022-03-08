package arrayExercises;

import java.util.Scanner;

public class PrintNumbersOnReverseOrder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int count = Integer.parseInt(userInput.nextLine());

        int[] array = new int[count];
        int[] current = new int[count];

        for (int a = 0; a < count; a++) {
            current[a] = Integer.parseInt(userInput.nextLine());
        }

        for (int b = 0; b < count; b++) {
            array[b] = current[count - 1 - b];
        }

        for(int element : array){
            System.out.println(element);
        }
    }
}



//Condition

//Read n numbers and print them in reverse order.



//Tests

//Input
//3
//10
//20
//30
//Output
//30
//20
//10


//Input
//3
//30
//20
//10
//Output
//10
//20
//30


//Input
//1
//10
//Output
//10
