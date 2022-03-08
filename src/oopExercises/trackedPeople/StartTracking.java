package oopExercises.trackedPeople;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class StartTracking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<TrackedPerson> people = new ArrayList<>();
        String command;
        String[] data;

        while(!(command = input.nextLine()).equals("End")) {
            data = command.split("\\s+");

            if(!checkPerson(people, data[0])) {
                people.add(new TrackedPerson(data[0]));
            }

            switch (data[1]) {
                case "company": {
                    for (TrackedPerson p : people) {
                        if(p.getName().equals(data[0])) p.setCompany(data[2], data[3], Double.parseDouble(data[4]));
                    }
                    break;
                }
                case "pokemon": {
                    for (TrackedPerson p : people) {
                        if(p.getName().equals(data[0])) p.setPokemon(data[2], data[3]);
                    }
                    break;
                }
                case "parents": {
                    for (TrackedPerson p : people) {
                        if(p.getName().equals(data[0])) p.setParents(data[2], data[3]);
                    }
                    break;
                }
                case "children": {
                    for (TrackedPerson p : people) {
                        if(p.getName().equals(data[0])) p.setChildren(data[2], data[3]);
                    }
                    break;
                }
                case "car": {
                    for (TrackedPerson p : people) {
                        if(p.getName().equals(data[0])) p.setCar(data[2], Integer.parseInt(data[3]));
                    }
                    break;
                }
                default: break;
            }
        }

        Consumer<TrackedPerson> print = p -> {
            System.out.println(p.getName());
            System.out.println("Company:");
            if(!p.getCompany().getCompanyName().isEmpty()) {
                System.out.printf("%s %s %.2f%n", p.getCompany().getCompanyName(), p.getCompany().getDepartment(), p.getCompany().getSalary());
            }
            System.out.println("Car:");
            if(!p.getCar().getCarModel().isEmpty()) {
                System.out.printf("%s %d%n", p.getCar().getCarModel(), p.getCar().getCarSpeed());
            }
            System.out.println("Pokemon:");
            if(!p.getPokemon().isEmpty()) {
                for(int a = 0; a < p.getPokemon().size(); a++) System.out.printf("%s %s%n", p.getPokemon().get(a).getPokemonName(), p.getPokemon().get(a).getPokemonType());
            }
            System.out.println("Parents:");
            if(!p.getParents().isEmpty()) {
                for(int b = 0; b < p.getParents().size(); b++) System.out.printf("%s %s%n", p.getParents().get(b).getParentName(), p.getParents().get(b).getParentBirthday());
            }
            System.out.println("Children:");
            if(!p.getChildren().isEmpty()) {
                for(int c = 0; c < p.getChildren().size(); c++) System.out.printf("%s %s%n", p.getChildren().get(c).getChildName(), p.getChildren().get(c).getChildBirthday());
            }
        };

        command = input.nextLine();
        for(TrackedPerson person : people) {
            if(person.getName().equals(command)) print.accept(person);
        }
    }

    private static boolean checkPerson (ArrayList<TrackedPerson> people, String name) {
        boolean flag = false;
        for (TrackedPerson p : people) {
            if(p.getName().equals(name)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}



//Condition

//Google is always watching you, so it should come as no surprise that they know everything about you (even your pokemon collection),
//since you’re really good at writing classes Google asked you to design a Class that can hold all the information they need for people.

//From the console you will receive an unknown amount of lines until the command "End" is read, on each of those lines there will be
//information about a person in one of the following formats:
//>>>	“<Name> company <companyName> <department> <salary>”
//>>>	“<Name> pokemon <pokemonName> <pokemonType>”
//>>>	“<Name> parents <parentName> <parentBirthday>”
//>>>	“<Name> children <childName> <childBirthday>”
//>>>	“<Name> car <carModel> <carSpeed>”

//You should structure all information about a person in a class with nested subclasses. People’s names are unique - there won’t be 2 people
//with the same name, a person can also have only 1 company and car, but can have multiple parents, children and pokemon.
//
//After the command "End" is received on the next line you will receive a single name, you should print all information about that person.
//Note that information can change during the input, for instance if we receive multiple lines which specify a person’s company,
//only the last one should be the one remembered. The salary must be formated to two decimal places after the separator.



//Tests

//PeterPetrov company PanInc Management 1000.00
//TeodorTeodorov car Trabant 60
//PeterPetrov pokemon Pikachu Electricity
//PeterPetrov parents MilaPetrova 22/02/1920
//TeodorTeodorov pokemon Electrode Electricity
//End
//TeodorTeodorov

//TeodorTeodorov
//Company:
//Car:
//Trabant 60
//Pokemon:
//Electrode Electricity
//Parents:
//Children:


//Nina pokemon Onyx Rock
//Nina parents Maria 13/03/1963
//Roxana pokemon Moltres Fire
//Nina company NinaInc Management 6666.66
//Nina children Valentina 03/09/2001
//Irina pokemon Blastoise Water
//Nina parents Peter 08/08/1962
//Nina car AudiA4 180
//Nina pokemon Charizard Fire
//End
//Nina

//Nina
//Company:
//NinaInc Management 6666,66
//Car:
//AudiA4 180
//Pokemon:
//Onyx Rock
//Charizard Fire
//Parents:
//Maria 13/03/1963
//Peter 08/08/1962
//Children:
//Valentina 03/09/2001
