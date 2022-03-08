package basicSyntaxExercises;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String surname = input.nextLine();

        if(name.equals("")){
            name = "*****";
        }

        if(surname.equals("")){
            surname = "*****";
        }

        System.out.printf("Hello, %s %s!", name, surname);
    }
}



//Condition

//Read two strings as an input – the first and last name of a person. Print a greeting in the following format:
//"Hello, " + {firstName} {lastName} + "!" , where if a name is missing, replace it with five stars "*".



//Tests

//Robert
//Ford
//Hello, Robert Ford!

//
//Ford
//Hello, ***** Ford!
