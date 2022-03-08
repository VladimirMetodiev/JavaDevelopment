package oopExercises.friends;

import java.util.Scanner;

public class StartFriendship {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String myName = "";

        while (myName.isEmpty()){
            System.out.println("Enter your name:");
            myName = input.nextLine();
        }

        System.out.println("Enter the count of friends:");
        int number = Integer.parseInt(input.nextLine());

        Friend me = new Friend();
        me.setMyName(myName);

        for (int a = 0; a < number; a++) {
            me.letsBeFriends(input.nextLine());
        }

        if(me.getCounter() > 0){
            System.out.println(me.toString());
        }
        else{
            System.out.println(me.getMyName() + " has not friends.");
        }

        input.close();
    }
}



//Condition

// Напишете програма, която съдържа поле за името на даден човек и поле-списък с неговите приятели.
// Принтирайте списъкът с приятели.



//Tests

//Vladimir
//5
//Alex
//Anna
//Irina
//Ivan
//Teodor

//Peter
//0
