package listExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HouseParty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countOfGuests = Integer.parseInt(reader.readLine());

        ArrayList<String> guests = new ArrayList<>();

        for (int a = 0; a < countOfGuests; a++) {
            String expression = reader.readLine();
            String guest = expression.substring(0, expression.indexOf(" "));

            if(expression.contains("is going")) {
                if(guests.contains(guest)) {
                    System.out.printf("%s is already in the list!%n", guest);
                }
                else {
                    guests.add(guest);
                }
            }
            else if(expression.contains("is not going")) {
                if(guests.contains(guest)) {
                    guests.remove(guest);

                }
                else {
                    System.out.printf("%s is not in the list!%n", guest);
                }
            }
        }

        guests.forEach(System.out::println);

        reader.close();
    }
}



//Condition

//Write a program that keeps track of the guests that are going to a house party. On the first input line you are going to
//receive how many commands you are going to have. On the next lines you are going to receive some of the following inputs:
//-	“{name} is going!”
//-	“{name} is not going!”
//If you receive the first type of input, you have to add the person if he/she is not in the list. (If he/she is in the list
//print on the console: “{name} is already in the list!”). If you receive the second type of input, you have to remove the person
//if he/she is in the list. (if not print: “{name} is not in the list!”). At the end print all the guests.



//Tests

//Input
//4
//Allie is going!
//George is going!
//John is not going!
//George is not going!

//Output
//John is not in the list!
//Allie


//Input
//5
//Tom is going!
//Annie is going!
//Tom is going!
//Garry is going!
//Jerry is going!

//Output
//Tom is already in the list!
//Tom
//Annie
//Garry
//Jerry


//Input
//10
//Boris is going!
//Svetlana is going!
//Gergana is not going!
//Nina is going!
//Teodor is going!
//Georgy is going!
//Maria is going!
//Svetlana is going!
//Eva is going!
//Georgy is not going!

//Output
//Gergana is not in the list!
//Svetlana is already in the list!
//Boris
//Svetlana
//Nina
//Teodor
//Maria
//Eva
