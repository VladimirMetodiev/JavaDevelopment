package basicSyntaxExercises;

import java.util.Scanner;

public class GradeCalculatorSolution {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int grade, sum = 0, gradeCounter = 0;

        printMessage();
        while ((grade = Integer.parseInt(input.nextLine())) >= 0){
            sum += grade;
            gradeCounter++;
            printMessage();
        }

        if (sum > 0) {
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + (double)sum / gradeCounter);
        }
        else {
            System.out.println("Sum = 0");
            System.out.println("Average = 0");
        }
    }

    static void printMessage(){
        System.out.println("Enter grade or negative number to quit:");
    }
}



//Tests

//Input
//5
//6
//7
//10
//2
//7
//9
//4
//8
//0
//-1
//Output
//Sum = 58
//Average = 5.8


//Input
//-1
//Output
//Sum = 0
//Average = 0