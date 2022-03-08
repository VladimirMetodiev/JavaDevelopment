package basicSyntaxExercises;

import java.util.Scanner;

public class MaximumFragmentLength {
    private static int counter = 1, fragment = 0;

    private static void checkUp() {
        if(counter > fragment) {
            fragment = counter;
        }
        counter = 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int previous = input.nextInt(), data = input.nextInt(), increase = Integer.compare(data, previous);

        while(true) {
            if(data == 0) {
                checkUp();
                break;
            }

            if(increase == 1 && data > previous) {
                ++counter;
            }
            else if(increase == 1 && data < previous) {
                checkUp();
                increase = -1;
                ++counter;
            }
            else if(increase == 1 && data == previous) {
                checkUp();
                increase = 0;
            }
            else if(increase == -1 && data < previous) {
                ++counter;
            }
            else if(increase == -1 && data > previous) {
                checkUp();
                increase = 1;
                ++counter;
            }
            else if(increase == -1 && data == previous) {
                checkUp();
                increase = 0;
            }
            else if(increase == 0 && data > previous) {
                increase = 1;
                ++counter;
            }
            else if(increase == 0 && data < previous) {
                increase = -1;
                ++counter;
            }

            previous = data;
            data = input.nextInt();
        }

        System.out.println(fragment);
    }
}



//Условие

//Дадена е последователност от естествени числа, която завършва при въвеждането на числото 0. Определете максималната дължина
//на монотоннен фрагмент от последователността (тоест такъв фрагмент, където всички елементи с изключение на първия,
//са или по-големи от предишния, или по-малки). Принтирайте максималната дължина.



//Тестове

//1 5 5 14 8 0
//2

//1 2 3 4 5 0
//5

//10 9 8 7 6 5 4 3 2 1 0
//10

//2 1 8 10 12 0
//4

//3 8 8 11 9 6 5 5 4 0
//4

//6 12 11 11 2 7 19 22 34 33 30 30 31 0
//5

//1 8 3 3 6 9 13 20 18 17 15 14 12 11 0
//7
