package basicSyntaxExercises;

import java.util.Scanner;

public class TrickyNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;

        for(char digit : input.nextLine().toCharArray()) {
            switch (digit) {
                case '0':
                case '6':
                case '9':
                    result += 1;
                    break;
                case '8':
                    result += 2;
                    break;
            }
        }

        System.out.println(result);
    }
}



//Условие

//Дава се едно цяло, положително число. Това число трябва да се преобразува в "хитроумно число", по следните примери за преобразуване:
//101=1
//8181515=4
//1111112=0
//616271=2
//8888888=14
//1010101=3
//7000007=5
//Принтирайте хитроумно число".



//Тестове

//689
//4

//58346
//3

//45360
//2



//Моето първо решение

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String data = input.nextLine();
//        int result = 0;
//
//        for (int a = 0; a < data.length(); a++) {
//            int digit = Integer.parseInt("" + data.charAt(a));
//            if(digit == 0 || digit == 6 || digit == 9) result += 1;
//            if(digit == 8) result += 2;
//        }
//
//        System.out.println(result);
//    }



//Броят се "кръгове" в графичното представяне на числата.
//0 кръга - 2, 3, 4, 5, 7
//1 кръг - 0, 6, 9
//2 кръга - 8
