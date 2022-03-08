package basicSyntaxExercises;

import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long balls = Long.parseLong(input.nextLine());

        boolean isItTrue = false;

        if(balls > 0) {
            if(checkUp(balls)) {
                isItTrue = true;
            }
            else {
                if(balls > 15) {
                    if(check(balls - 3)) isItTrue = true;
                    if(check((balls - 3) % 15)) isItTrue = true;
                    if(check(balls % 15)) isItTrue = true;
                }

                if(balls > 8) {
                    if(check(balls - 5)) isItTrue = true;
                    if(check(balls % 8)) isItTrue = true;
                }
                else {
                    if(check(balls)) isItTrue = true;
                }
            }
        }

        if(isItTrue) System.out.println("YES");
        else System.out.println("NO");
    }

    private static boolean checkUp(long balls) {
        return balls % 3 == 0 || balls % 5 == 0 || balls % 8 == 0;
    }

    private static boolean check(long balls) {
        if(balls > 8) {
            balls = balls % 8;
            return checkUp(balls);
        }
        else {
            return checkUp(balls);
        }
    }
}



//Условие

//В сладкарницата Меденото царство, сладоледа се продава или по три топки, или по пет топки. Можете ли да купите точно К топки сладолед?

//Входни данни
//Въвежда се числото К (цяло, положително число)

//Изход
//Програмата трябва да отпечата думата YES, ако при такива условия, е възможно да се вземат точно К топки сладолед (не повече и не по-малко),
//в противен случай трябва да бъде отпечатано NO.



//Тестове

//1
//NO

//3
//YES

//4
//NO

//5
//YES

//8
//YES

//11
//YES

//12
//YES

//13
//YES

//14
//YES

//15
//YES

//16
//YES

//17
//YES

//19
//YES

//22
//YES

//23
//YES

//27
//YES

//28
//YES

//29
//YES

//31 - 3, 3, 5, 5, 5, 5, 5
//YES

//123
//YES

//61
//YES

//62
//YES

//111
//YES



//Solutions

// Долното решение, за числото 31 (3, 3, 5, 5, 5, 5, 5) връща NO

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        long balls = Long.parseLong(input.nextLine());
//
//        boolean isItTrue = false;
//
//        if(balls > 0) {
//            if(checkUp(balls)) {
//                isItTrue = true;
//            }
//            else {
//                if(balls > 15) {
//                    if(check(balls - 3)) isItTrue = true;
//                    long current = balls % 15;
//                    if(check(current)) isItTrue = true;
//                }
//
//                if(balls > 8) {
//                    if(check(balls - 5)) isItTrue = true;
//                    long current = balls % 8;
//                    if(check(current)) isItTrue = true;
//                }
//                else {
//                    if(check(balls)) isItTrue = true;
//                }
//            }
//        }
//
//        if(isItTrue) System.out.println("YES");
//        else System.out.println("NO");
//    }
//
//    private static boolean checkUp(long balls) {
//        return balls % 3 == 0 || balls % 5 == 0 || balls % 8 == 0;
//    }
//
//    private static boolean check(long balls) {
//        if(balls > 8) {
//            balls = balls % 8;
//            return checkUp(balls);
//        }
//        else {
//            return checkUp(balls);
//        }
//    }
