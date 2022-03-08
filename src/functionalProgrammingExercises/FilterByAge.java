package functionalProgrammingExercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FilterByAge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        LinkedHashMap<String, Integer> people = new LinkedHashMap<>();

        for (int a = 0; a < number; a++) {
            String[] data = input.nextLine().split(",\\s+");
            people.put(data[0], Integer.parseInt(data[1]));
        }

        String condition = input.nextLine();
        int age = Integer.parseInt(input.nextLine());
        String format = input.nextLine();

        if(condition.equals("younger")){
            for(String element : people.keySet()){
                if(people.get(element) < age){
                    switch (format){
                        case "name": System.out.println(element); break;
                        case "age": System.out.println(people.get(element)); break;
                        case "name age": System.out.println(element + " - " + people.get(element)); break;
                        default: break;
                    }
                }
            }
        }
        else if(condition.equals("older")){
            for(String element : people.keySet()){
                if(people.get(element) >= age){
                    switch (format){
                        case "name": System.out.println(element); break;
                        case "age": System.out.println(people.get(element)); break;
                        case "name age": System.out.println(element + " - " + people.get(element)); break;
                        default: break;
                    }
                }
            }
        }
    }
}



//Condition

//Write a program that reads an integer N on the first line. And on next N lines read pairs of "[name], [age]".
//Then read three more lines with:
//Condition - "younger" or "older"
//Age - Integer
//Format - "name", "age" or "name age"
//Depending on the condition, checkUp the pairs in the right format.



//Tests

//Input
//5
//Peter, 20
//Alex, 18
//Mimi, 29
//Ico, 31
//Vlad, 16
//older
//20
//name age

//Output
//Peter - 20
//Mimi - 29
//Ico - 31


//Input
//5
//Peter, 20
//Alex, 18
//Mimi, 29
//Ico, 31
//Vlad, 16
//younger
//20
//name

//Output
//Alex
//Vlad


//Input
//5
//Peter, 20
//Alex, 18
//Mimi, 29
//Ico, 31
//Vlad, 16
//younger
//50
//age

//Output
//20
//18
//29
//31
//16
