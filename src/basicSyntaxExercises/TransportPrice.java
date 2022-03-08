package basicSyntaxExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distance = Double.parseDouble(input.nextLine());
        String partOfDay = input.nextLine().toLowerCase();

        if(distance < 20){
            switch (partOfDay){
                case "day": System.out.printf("%.2f", 0.7 + distance * 0.79); break;
                case "night": System.out.printf("%.2f", 0.7 + distance * 0.9); break;
                default: break;
            }
        }
        else if(distance < 100){
            System.out.printf("%.2f", distance * 0.09);
        }
        else{
            System.out.printf("%.2f", distance * 0.06);
        }
    }
}



//Condition

//A student travels n kilometers using only one type of transport based on the distance that he will travel:
//Taxi: Initial tax: 0.70 USD. Daytime cost: 0.79 USD/km. Night time cost: 0.90 USD/km.
//Bus: Day / Night tariff: 0.09 USD/km. For at least 20 kilometers.
//Train: Day / Night tariff: 0.06 USD/km. For at least 100 kilometers.
//Write a program that calculates the price of the trip by a given distance and time of day.
//Format the output to the second digit after the decimal separator.



//Tests

//5
//day
//4,65

//7
//night
//7,00

//25
//day
//2,25

//180
//night
//10,80
