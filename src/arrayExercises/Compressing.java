package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Compressing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int a = 0; a < array.length - 1; a++) {
            for (int b = a + 1; b < array.length; b++) {
                if(array[a] != 0) {
                    break;
                }
                if(array[b] == 0) {
                    continue;
                }
                if(array[b] != 0) {
                    array[a] = array[b];
                    array[b] = 0;
                    break;
                }
            }
        }

        Arrays.stream(array).forEach(el -> System.out.print(el + " "));
    }
}



//Условие

//На един ред, е дадена последователност от цели числа, разделени с интервал. Необходимо е да "компресирате" тази последователност,
//като преместите всички ненулеви елементи в лявата страна на масива, без да променяте техният ред, а всички нули трябва да преместите
//в дясната страна на масива.

//Редът на ненулевите елементи не може да се променя;
//Не може да се използват допълнителни масиви или списъци;

//Принтирайте елементите на така полученият масив, разделени с интервал.



//Тестове

//1 0 1 1 0
//1 1 1 0 0

//2 0 0 2 2 2
//2 2 2 2 0 0

//0 5 3 0 0 -6 0
//5 3 -6 0 0 0 0

//0 0 0 4 0
//4 0 0 0 0

//8 8 0 8 8 8
//8 8 8 8 8 0

//9 8 0 9 8
//9 8 9 8 0

//0 0 0 0 0 0
//0 0 0 0 0 0
