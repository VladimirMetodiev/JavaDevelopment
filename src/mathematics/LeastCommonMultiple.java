package mathematics;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Най-малко общо кратно (a != 0 & b != 0)
        int e = Integer.parseInt(input.nextLine());
        int f = Integer.parseInt(input.nextLine());

        for (int a = 2; a <= e * f; a++) {
            if(a % e == 0 && a % f == 0) {
                System.out.println(a);
                break;
            }
        }
    }
}



//Дефиниция: най-малко общо кратно на две цели числа a и b е най-малкото положително цяло число, което може да бъде разделено както на a, така и на b.

//Тестове

//5
//6
//30

//16
//20
//80

//36
//48
//144



// Най-малък общ делител

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int x = input.nextInt();
//
//        for (int a = 2; a <= x; a++) {
//            if(x % a == 0) {
//                System.out.println(a);
//                break;
//            }
//        }
//    }
