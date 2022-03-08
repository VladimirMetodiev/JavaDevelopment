package basicSyntaxExercises;

import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mark = -1;

        while(mark < 0 || mark > 100){
            mark = input.nextInt();
            if(mark < 0 || mark > 100) System.out.println("Wrong value!");
        }

        System.out.print("You have got ");

        if(mark >= 85){
            System.out.println("an Excellent.");
        }
        else if(mark >= 75){
            System.out.println("a Very good.");
        }
        else if(mark >= 65){
            System.out.println("a Good.");
        }
        else if(mark >= 55){
            System.out.println("a Medium.");
        }
        else{
            System.out.println("a Weak.");
        }
    }
}
