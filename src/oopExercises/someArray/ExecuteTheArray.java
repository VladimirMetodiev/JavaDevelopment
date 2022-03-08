package oopExercises.someArray;

import java.util.Random;
import java.util.Scanner;

public class ExecuteTheArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = Integer.parseInt(input.nextLine());

        Random random = new Random();
        SomeArray array = new SomeArray();

        for (int a = 0; a < number; a++) {
            array.add(random.nextInt(100) + 1);
        }

        for (int b = 0; b < array.size; b++) {
            if(b < array.size - 1) System.out.print(array.data[b] + ", ");
            else System.out.print(array.data[b] + ";");
        }
    }
}



//Condition

// Създайте клас Array.

// Той трябва да има две свойства:
// public int size
// public int [] data

// В класът Array трябва да бъде реализиран метод:
// public void add(int element)

// Този метод трябва да постави нов елемент в края на масива и да увеличи дължината - size на масива с 1.
// В случай на препълване е необходимо да увеличите дължината на масива (необходимо е да изберете нова по-голяма дължина
// и да копирате в уголеменият масив съществуващите данни)

// Добавете в масива, N на брой, случайни, цели числа, в диапазона [1, 100]
// Накрая, принтирайте целият масив



//Note

//Java error message: Reached End of File While Parsing - означава, че липсва фигуративна скоба на метод или клас