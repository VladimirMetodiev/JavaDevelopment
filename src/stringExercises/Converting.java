package stringExercises;

import java.util.Scanner;

public class Converting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        int start = input.nextInt(), end = input.nextInt();

        StringBuilder sb = new StringBuilder(line);
        StringBuilder subLine = new StringBuilder(sb.substring(start - 1, end));
        sb.replace(start - 1, end, subLine.reverse().toString());
        System.out.println(sb.toString());
    }
}



//Условие

//Даден е символен низ STR, в който се избира подниз, състоящ се от символи от i-ти до j-ти включително (символите на низа STR са номерирани от едно).
//i-тият знак се разменя с j-тия , (i+1) с (j-1) и т.н. Принтирайте символният низ STR, след като извършите промените.

//Входни данни
//На първият ред ще получите символният низ;
//На вторият ред числата i и j (i <= j) разделени с интервал;

//Изход
//Принтирайте символният низ.



//Тестове

//roadability
//7 8
//roadabliity

//adaptability
//3 9
//adlibatpaity
