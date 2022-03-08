package mathematics;

import java.util.Scanner;

public class SumOfTheElementsOfGeometricProgression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = Long.parseLong(input.nextLine());
        int n = Integer.parseInt(input.nextLine());

        System.out.println(getSum(a, n));
    }

    public static long getSum(long a, int n) {
        if(n == 0) {
            return 1L;
        }
        else{
            return a * getSum(a, (n - 1)) + 1L;
        }
    }
}



//Условие

//Дадени са двете естествени числа a и n, изчислете сумата 1+a^1+a^2+...+a^n, без да използвате формулата за сума на геометрична прогресия.
//Времето за изпълнение на програмата трябва да бъде пропорционално на n.



//Тестове

//3
//1
//4

//2
//2
//7

//5
//19
//23841857910156
