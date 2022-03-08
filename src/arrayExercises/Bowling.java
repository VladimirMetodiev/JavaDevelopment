package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Bowling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[] skittles = new int[data[0]];
        Arrays.fill(skittles, 1);

        int length = data[1];

        for (int a = 0; a < length; a++) {
            data = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            if(data[0] + 1 >= 1 && data[0] <= skittles.length &&
                    data[1] + 1 >= 1 && data[1] <= skittles.length &&
                    data[0] < data[1]) {

                for (int b = data[0]; b <= data[1]; b++) {
                    skittles[b - 1] = 0;
                }
            }
        }

        for(int num : skittles) {
            if(num == 1) System.out.print("I");
            else System.out.print(".");
        }
    }
}



//Условие

//Разполагаме с N кегли, поставени в един ред, номерирани отляво надясно с числа от 1 до N. След това, хвърляме K на брой топки, по този ред,
//всяка топка, би могла да събаря, кегли с номера от L до R включително. Определете кои кегли, накрая, са останали на място.

//Входни данни
//На първи ред получаваме двойка числа, разделени с интервал - броя на кеглите N и броя на хвърлянията K;
//На следващите K реда, получаваме двойка числа, разделени с интервал, които са НОМЕРАТА на съборените кегли, от L до R включително;

//Изход
//Принтирайте последователност от N знака, където с "I" е означена стояща кегла, а с "." съборена кегла.



//Тестове

//10 2
//1 2
//5 7
//..II...III

//10 3
//8 10
//2 5
//3 6
//I.....I...

//10 4
//9 10
//1 2
//2 3
//5 7
//...I...I..

//10 4
//1 3
//8 10
//4 5
//6 7
//..........

//10 2
//-3 -1
//12 15
//IIIIIIIIII

