package basicSyntaxExercises;

import java.util.Scanner;

public class BuyACake {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int banknotes = Integer.parseInt(input.nextLine());
        int coins = Integer.parseInt(input.nextLine());
        int pies = Integer.parseInt(input.nextLine());

        coins *= pies;

        System.out.printf("%d %d", pies * banknotes + coins / 100, coins % 100);
    }
}



//Условие

//Един сладкиш, в сладкарницата Меденото царство, струва A банкноти и B монети. Определете, колко банкноти и монети
//трябва да платите за N сладкиша.

//На входа ще получите три реда, с по едно цяло число.



//Тестове

//0
//89
//2
//1 78

//0
//89
//8
//7 12

//5
//99
//3
//17 97

//6
//29
//10
//62 90
