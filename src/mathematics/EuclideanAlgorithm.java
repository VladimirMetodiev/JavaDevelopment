package mathematics;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        int greatestCommonDivisor = gcd(x, y);
        System.out.println(greatestCommonDivisor);
    }

    private static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }
}



//Най-голям общ делител (НОД) на две цели числа, поне едното от които е различно от нула, се нарича най-голямото цяло число,
//което дели и двете числа без остатък.



//Алгоритъм на Евклид: Нека са дадени две отсечки с дължина A и B. Изваждаме по-малката отсечка от по-голямата отсечка, след което заменяме
//по-голямата отсечка с получената разлика. Повтаряме тази операция, като изваждаме по-малката отсечка от по-голямата, докато
//отсечките станат равни. Ако това се случи, тогава първоначалните отсечки са съизмерими, а последната получена отсечка,
//е тяхната най-голяма обща мярка. Ако няма обща мярка, тогава процесът е безкраен.

//Намиране на най-голям общ делител, по алгоритъма на Евклид, така както аз го разбрах:
//Дадени са две цели числа (поне едното, от които е различно от нула). От по-голямото изваждам по-малкото. Полученият резултат
//присвоявам на по-голямото (това от, което съм изваждал). Извършвам тази операция, докато двете числа станат равни.
//Тогава тяхната стойност, е равна на най-големият общ делител, на тези числа.



//Решение с рекурсия

//public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int x = input.nextInt();
//        int y = input.nextInt();
//
//        int greatestCommonDivisor = gcd(x, y);
//        System.out.println(greatestCommonDivisor);
//    }
//
//    private static int gcd(int a, int b) {
//        if (b == 0) return a;
//        else return gcd(b, a % b);
//    }
