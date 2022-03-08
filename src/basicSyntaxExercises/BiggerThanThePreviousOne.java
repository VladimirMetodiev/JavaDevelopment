package basicSyntaxExercises;

import java.util.Scanner;

public class BiggerThanThePreviousOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int odd = 0, even = input.nextInt(), counter = 0;
        boolean isItEven = true;

        while(true) {
            if(isItEven) {
                odd = input.nextInt();
                if(even < odd) {
                    ++counter;
                }
                isItEven = false;
            }
            else {
                even = input.nextInt();
                if(odd < even) {
                    ++counter;
                }
                isItEven = true;
            }

            if(odd == 0 || even == 0) {
                break;
            }
        }

        System.out.println(counter);
    }
}



//Условие

//Дадена е последователност от естествени числа, която завършва с въвеждането на числото 0. Определете колко елемента
//от тази последователност са по-големи от предишния елемент. Принтирайте резултата.



//Тестове

//1 7 9 0
//2

//5 3 8 4 4 9 0
//2

//5 2 5 2 5 2 0
//2

//3 8 15 21 6 7 7 80 0
//5

//8 8 8 8 0
//0

//10 8 6 4 2 0
//0

