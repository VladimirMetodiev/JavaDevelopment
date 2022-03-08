package mathematics;

import java.util.Scanner;

public class SmallestDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        for (int a = 2; a <= x; a++) {
            if(x % a == 0) {
                System.out.println(a);
                break;
            }
        }
    }
}



//Бележка:
//quotient = dividend / divisor
//частно = делимо / делител



//Условие
//Намерете най-малкият естествен делител на числото Х, различен от 1 (2 <= Х <= 30000).



//Тестове

//6
//2

//81
//3

//17
//17
