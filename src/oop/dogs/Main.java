package oop.dogs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Dog theFirstDog = new Dog();
        Dog.dogCount++;
        Dog theSecondDog = new Dog();
        Dog.dogCount++;


        theFirstDog.setBread("Labrador");
        theFirstDog.setName("Charles");

        System.out.println("Enter the size of the dog:");
        String exp = input.nextLine().toLowerCase();

        while (true) {
            theFirstDog.setSize(exp);

            if(exp.equals("big") || exp.equals("average") || exp.equals("small")){
                break;
            }

            System.out.println("Enter the size of the dog:");
            exp = input.nextLine().toLowerCase();
        }


        theSecondDog.setBread("Sheppard");
        theSecondDog.setName("Runner");

        System.out.println("Enter the size of the dog:");
        exp = input.nextLine().toLowerCase();

        while (true) {
            theSecondDog.setSize(exp);

            if(exp.equals("big") || exp.equals("average") || exp.equals("small")){
                break;
            }

            System.out.println("Enter the size of the dog:");
            exp = input.nextLine().toLowerCase();
        }


        System.out.println("Enter a dog's bread:");
        String bread = input.nextLine();
        System.out.println("Enter a dog's name:");
        String name = input.nextLine();

        Dog theThirdDog = new Dog(bread, name);

        System.out.println("Enter a dog's size:");
        exp = input.nextLine().toLowerCase();

        while (true) {
            theThirdDog.setSize(exp);

            if(exp.equals("big") || exp.equals("average") || exp.equals("small")){
                break;
            }

            System.out.println("Enter a dog's size:");
            exp = input.nextLine().toLowerCase();
        }


        System.out.printf("The count of dogs is: %d%n", Dog.getDogCount());

        System.out.printf("%s's name is %s.%n", theFirstDog.getBread(), theFirstDog.getName());
        theFirstDog.bite();
        System.out.printf("The %s barks ", theFirstDog.getBread());
        theFirstDog.bark();

        System.out.printf("%s's name is %s.%n", theSecondDog.getBread(), theSecondDog.getName());
        theSecondDog.bite();
        System.out.printf("The %s barks ", theSecondDog.getBread());
        theSecondDog.bark();

        System.out.printf("%s's name is %s.%n", theThirdDog.getBread(), theThirdDog.getName());
        theThirdDog.bite();
        System.out.printf("The %s barks ", theThirdDog.getBread());
        theThirdDog.bark();
    }
}
