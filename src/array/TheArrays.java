package array;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        /*
         * МАСИВ (Array) - това е именувана съвкупност от еднотипни променливи, разположени в паметта, непосредствено
         * една след друга, достъпа към които се осъществява по индекс.
         * Променливите на масива се наричат елементи, те са номерирани с числата от 0 за първият елемент, до n-1, за
         * n-тия елемент. Номерата на елементите се наричат индекси.
         * ДЪЛЖИНА НА МАСИВА - това е максималният брой на елементите в даден масив.
         * Масивите имат фиксирана дължина. Тя се указва при заделянето или инициализирането на масива.
         */

        /*
         * ПРИМЕР:
         * byte[] array = new byte[10];
         * - byte е типът на масива
         * - квадратните скоби [] указват, че променливата е масив
         * - array е идентификатор (име) на масива
         * - броят на елементите, се указва в квадратните скоби, на изразът, с който се създава масива (в примера 10)
         */


        /* Деклариране на масив */
        int[] myArray;


        /* Създаване (заделяне) на масив */
        myArray = new int[50];


        /* Инициализиране на масив */
        int[] numbers = new int[] {1, 8, 15, 36, 123};
        double[] anotherNumbers = {3.25, 3.5, 3.75, 4.0, 4.25, 4.5, 4.75, 5.0};
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        /* Достъпването на елементите става по индекс */
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;
        System.out.println(myArray[2]);
        System.out.println(daysOfWeek[4]);


        /* Извеждане на елементите на масив */
        for(int a = 5; a < myArray.length; a++) {
            myArray[a] = a + 1;
            if(a < myArray.length - 1) System.out.print(myArray[a] + ", ");
            else System.out.println(myArray[a]);
        }

        for(String s : daysOfWeek) {
            System.out.print(s + " ");
        }
        System.out.println();


        /* Принтиране на цял едномерен масив */
        System.out.println(Arrays.toString(anotherNumbers));

        Arrays.stream(numbers).forEach(num -> System.out.print(num + " "));
        System.out.println();


        /* Принтиране на адресът в динамичната памет, към който сочи масивът */
        System.out.println(myArray);
    }
}
