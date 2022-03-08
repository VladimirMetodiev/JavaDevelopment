package oopExercises.catLady;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Cat> cats = new ArrayList<>();
        String command;
        String[] data;

        while(!(command = input.nextLine()).equals("End")){
            data = command.split("\\s+");

            switch (data[0]) {
                case "Siamese": cats.add(new Siamese(data[0], data[1], Double.parseDouble(data[2]))); break;
                case "Cymric": cats.add(new Cymric(data[0], data[1], Double.parseDouble(data[2]))); break;
                case "StreetExtraordinaire": cats.add(new StreetExtraordinaire(data[0], data[1], Double.parseDouble(data[2]))); break;
                default: break;
            }
        }

        command = input.nextLine();

        for(Cat cat : cats) {
            if(cat.getName().equals(command)) {
                System.out.println(cat);
                break;
            }
        }
    }
}



//Condition

//Eva has many cats in her house of various breeds, since some breeds have specific characteristics, Eva needs some way to catalogue the cats,
//help her by creating a class hierarchy with all her breeds of cats so that she can easily check on their characteristics.
//Eva has 3 specific breeds of cats "Siamese", "Cymric" and the very famous bulgarian breed "Street Extraordinaire",  each breed
//has a specific characteristic about which information should be kept. For the Siamese cats their ear size should be kept,
//for Cymric cats - the length of their fur in millimetres and for the Street Extraordinaire the decibels of their meowing during the night.
//From the console you will receive lines of cat information until the command "End" is received, the information will come in
//one of the following formats:
//>>>	"Siamese <name> <earSize>"
//>>>	"Cymric <name> <furLength>"
//>>>	"StreetExtraordinaire <name> <decibelsOfMeows>"
//On the last line after the "End" command you will receive the name of a cat, you should print that cat’s information
//in the same format in which you received it.



//Tests

//Input
//StreetExtraordinaire Erato 85
//Siamese Cleo 5
//Cymric Terpsichore 27
//End
//Terpsichore

//Output
//Cymric Terpsichore 27,00


//Input
//StreetExtraordinaire Melpomene 89
//StreetExtraordinaire Polyhymnia 100
//Cymric Hephaestus 31
//End
//Polyhymnia

//Output
//StreetExtraordinaire Polyhymnia 100,00

