package basicSyntaxExercises;

import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] dozens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousands = {"", "M"};

        int number = Integer.parseInt(input.nextLine());

        StringBuilder romanNumeral = new StringBuilder();
        romanNumeral.append(thousands[number / 1000]);
        romanNumeral.append(hundreds[(number / 100) % 10]);
        romanNumeral.append(dozens[(number % 100) / 10]);
        romanNumeral.append(units[number % 10]);

        System.out.println(romanNumeral);
    }
}



//Условие

//Дадено е десетичното число N (1 <= X <= 1000). Необходимо е да се превърне това число в число от римската цифрова система.



//Тестове

//5
//V

//44
//XLIV

//45
//XLV

//73
//LXXIII

//90
//XC

//160
//CLX

//207
//CCVII

//674
//DCLXXIV

//975
//CMLXXV

//999
//CMXCIX

//1000
//M



//Моето първо решение

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        char[] digits = new StringBuilder(input.nextLine()).reverse().toString().toCharArray();
//        StringBuilder romanNumeral = new StringBuilder();
//
//        for (int a = digits.length; a >= 1; a--) {
//            switch (a) {
//                case 1: {
//                    switch (Integer.parseInt(Character.toString(digits[a - 1]))) {
//                        case 1: romanNumeral.append("I"); break;
//                        case 2: romanNumeral.append("II"); break;
//                        case 3: romanNumeral.append("III"); break;
//                        case 4: romanNumeral.append("IV"); break;
//                        case 5: romanNumeral.append("V"); break;
//                        case 6: romanNumeral.append("VI"); break;
//                        case 7: romanNumeral.append("VII"); break;
//                        case 8: romanNumeral.append("VIII"); break;
//                        case 9: romanNumeral.append("IX"); break;
//                    }
//                    break;
//                }
//                case 2: {
//                    switch (Integer.parseInt(Character.toString(digits[a - 1])) * 10) {
//                        case 10: romanNumeral.append("X"); break;
//                        case 20: romanNumeral.append("XX"); break;
//                        case 30: romanNumeral.append("XXX"); break;
//                        case 40: romanNumeral.append("XL"); break;
//                        case 50: romanNumeral.append("L"); break;
//                        case 60: romanNumeral.append("LX"); break;
//                        case 70: romanNumeral.append("LXX"); break;
//                        case 80: romanNumeral.append("LXXX"); break;
//                        case 90: romanNumeral.append("XC"); break;
//                    }
//                    break;
//                }
//                case 3: {
//                    switch (Integer.parseInt(Character.toString(digits[a - 1])) * 100) {
//                        case 100: romanNumeral.append("C"); break;
//                        case 200: romanNumeral.append("CC"); break;
//                        case 300: romanNumeral.append("CCC"); break;
//                        case 400: romanNumeral.append("CD"); break;
//                        case 500: romanNumeral.append("D"); break;
//                        case 600: romanNumeral.append("DC"); break;
//                        case 700: romanNumeral.append("DCC"); break;
//                        case 800: romanNumeral.append("DCCC"); break;
//                        case 900: romanNumeral.append("CM"); break;
//                    }
//                    break;
//                }
//                case 4: {
//                    romanNumeral.append("M");
//                    a = 0;
//                    break;
//                }
//            }
//        }
//
//        System.out.println(romanNumeral);
//    }
