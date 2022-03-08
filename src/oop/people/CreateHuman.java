package oop.people;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class CreateHuman {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Class human = Human.class;
        Constructor emptyConstructor = human.getDeclaredConstructor();
        Constructor ageConstructor = human.getDeclaredConstructor(int.class);
        Constructor nameAndAgeConstructor = human.getDeclaredConstructor(String.class, int.class);

        String name = input.nextLine();
        int age = Integer.parseInt(input.nextLine());

        Human basePerson = (Human) emptyConstructor.newInstance();
        Human personWithAge = (Human) ageConstructor.newInstance(age);
        Human personFull = (Human) nameAndAgeConstructor.newInstance(name, age);

        System.out.printf("%s %s%n", basePerson.name, basePerson.age);
        System.out.printf("%s %s%n", personWithAge.name, personWithAge.age);
        System.out.printf("%s %s%n", personFull.name, personFull.age);

    }
}



//Test

//Alex
//20
//No Name 1
//No Name 20
//Alex 20
