package mapExercises;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, String> phoneOwners = new HashMap<>();
        String command;

        while(!(command = input.nextLine()).equals("search")) {
            String[] data = command.split("-");
            phoneOwners.put(data[0], data[1]);
        }

        while(!(command = input.nextLine()).equals("stop")) {
            if(phoneOwners.containsKey(command)) {
                System.out.printf("%s -> %s%n", command, phoneOwners.get(command));
            }
            else {
                System.out.printf("Contact %s does not exist.%n", command);
            }
        }
    }
}



//Condition

//Write a program that receives some info from the console about people and their phone numbers.
//You are free to choose the manner in which the data is entered; each entry should have just one name and one number (both of them strings).
//If you receive a name that already exists in the phone-book, simply update its number.
//After filling this simple phone-book, upon receiving the command "search", your program should be able to perform a search of a contact
//by name and print her details in format "{name} -> {number}". In case the contact isn't found, print "Contact {name} does not exist."



//Test

//Input
//Anna Dimitrova-+359888880000
//Todorov-02/980202026
//Andrew-+359888882222
//Valentin Ivanov-02/981475162
//Vladimir Metodiev-0888787878
//search
//Alexander
//Andrew
//Valentin
//Valentin Ivanov
//Dimitrova
//Anna Dimitrova
//stop