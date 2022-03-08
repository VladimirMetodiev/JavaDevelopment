package basicSyntaxExercises;

import java.util.Locale;
import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        input.useLocale(Locale.US);

        int a = input.nextInt();
        double b = input.nextDouble();
        double c = input.nextDouble();

        String hex = Integer.toHexString(a).toUpperCase();
        String binary = Integer.toBinaryString(a);

        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", hex, Integer.parseInt(binary), b, c);
    }
}



//Condition

//Write a program that reads 3 numbers:
// an integer a (0 ≤ a ≤ 500)
// a floating-point b
// a floating-point c

//Print them in 4 virtual columns on the console, separated with a pipe '|'. Each column should have a width of 10 characters.
// First, the number a should be printed in hexadecimal, left aligned
// Second, the number a should be printed in binary form, padded with zeroes
// Third, the number b should be printed with 2 digits after the decimal point, right aligned
// Lastly, the number c should be printed with 3 digits after the decimal point, left aligned

//You will receive a, b and c on a single line, separated by one or more white spaces.



//Tests

//254	11.6	0.5
//|FE        |0011111110|     11,60|0,500     |

//499	-0.5559	10000
//|1F3       |0111110011|     -0,56|10000,000 |

