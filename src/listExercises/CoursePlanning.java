package listExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoursePlanning {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> schedule = Arrays.stream(input.nextLine().split(",\\s+")).collect(Collectors.toList());

        String command;

        while(!(command = input.nextLine()).equals("course start")) {
            String[] data = command.split(":");
            switch(data[0]) {
                case "Add": {
                    if(!schedule.contains(data[1])) {
                        schedule.add(data[1]);
                    }
                    break;
                }
                case "Insert": {
                    if(!schedule.contains(data[1])) {
                        schedule.add(Integer.parseInt(data[2]), data[1]);
                    }
                    break;
                }
                case "Remove": {
                    if(schedule.contains(data[1] + "-Exercise")) {
                        schedule.remove(schedule.indexOf(data[1] + "-Exercise"));
                    }
                    if(schedule.contains(data[1])) {
                        schedule.remove(schedule.indexOf(data[1]));
                    }
                    break;
                }
                case "Swap": {
                    if(schedule.contains(data[1]) && schedule.contains(data[1] + "-Exercise") && schedule.contains(data[2]) && schedule.contains(data[2] + "-Exercise")) {
                        schedule = swap(schedule, schedule.indexOf(data[1]), schedule.indexOf(data[1] + "-Exercise"), schedule.indexOf(data[2]), schedule.indexOf(data[2] + "-Exercise"));
                    }
                    else if(schedule.contains(data[1]) && !schedule.contains(data[1] + "-Exercise") && schedule.contains(data[2]) && schedule.contains(data[2] + "-Exercise")) {
                        schedule = swap(schedule, schedule.indexOf(data[1]), schedule.indexOf(data[2]), schedule.indexOf(data[2] + "-Exercise"));
                    }
                    else if(schedule.contains(data[1]) && schedule.contains(data[1] + "-Exercise") && schedule.contains(data[2]) && !schedule.contains(data[2] + "-Exercise")) {
                        schedule = swap(schedule, schedule.indexOf(data[2]), schedule.indexOf(data[1]), schedule.indexOf(data[1] + "-Exercise"));
                    }
                    else if(schedule.contains(data[1]) && !schedule.contains(data[1] + "-Exercise") && (schedule.contains(data[2]) && !schedule.contains(data[2] + "-Exercise"))) {
                        schedule = swap(schedule, schedule.indexOf(data[1]), schedule.indexOf(data[2]));
                    }
                    break;
                }
                case "Exercise": {
                    if(schedule.contains(data[1]) && !schedule.contains(data[1] + "-Exercise")) {
                        int index = schedule.indexOf(data[1]);
                        schedule.add(index + 1, schedule.get(index) + "-Exercise");
                    }
                    if(!schedule.contains(data[1])) {
                        schedule.add(data[1]);
                        schedule.add(data[1] + "-Exercise");
                    }
                }
                default: break;
            }
            System.out.println(String.join(", ", schedule));
        }

        for (int a = 0; a < schedule.size(); a++) {
            System.out.printf("%d.%s%n", a + 1, schedule.get(a));
        }
    }

    private static List<String> swap (List<String> list, int first, int second) {
        String current = list.get(first);
        list.set(first, list.get(second));
        list.set(second, current);
        return list;
    }

    private static List<String> swap (List<String> list, int first, int second, int third) {
        String current = list.get(first);
        list.set(first, list.get(second));
        list.set(second, current);

        if(first == list.size() - 1) {
            list.add(list.get(third));
            list.remove(third);
        }
        else {
            current = list.get(third);
            if(third < first) {
                list.remove(third);
                list.add(first, current);
            }
            else {
                list.remove(third);
                list.add(first + 1, current);
            }
        }
        return list;
    }

    private static List<String> swap (List<String> list, int first, int second, int third, int fourth) {
        String current = list.get(first);
        list.set(first, list.get(third));
        list.set(third, current);
        current = list.get(second);
        list.set(second, list.get(fourth));
        list.set(fourth, current);
        return list;
    }
}



//Condition

//You are tasked to help planning the next Programing Fundamentals course by keeping track of the lessons, that are going
//to be included in the course, as well as all the exercises for the lessons.
//On the first input line you will receive the initial schedule of lessons and exercises that are going to be part of the next course,
//separated by comma and space ", ". But before the course starts, there are some changes to be made. Until you receive
//"course start" you will be given some commands to modify the course schedule. The possible commands are:

//Add:{lessonTitle} – add the lesson to the end of the schedule, if it does not exist.
//Insert:{lessonTitle}:{index} – insert the lesson to the given index, if it does not exist.
//Remove:{lessonTitle} – remove the lesson, if it exists.
//Swap:{lessonTitle}:{lessonTitle} – change the place of the two lessons, if they exist.
//Exercise:{lessonTitle} – add Exercise in the schedule right after the lesson index, if the lesson exists and there is no exercise already,
//in the following format "{lessonTitle}-Exercise". If the lesson doesn`t exist, Add the lesson in the end of the course schedule,
//followed by the Exercise.
//Each time you Swap or Remove a lesson, you should do the same with the Exercises, if there are any, which follow the lessons.

//Input / Constraints
//>>> first line – the initial schedule lessons – strings, separated by comma and space ", "
//>>> until "course start" you will receive commands in the format described above
//Output
//>>> Print the whole course schedule, each lesson on a new line with its number(index) in the schedule:
//"{lesson index}.{lessonTitle}"
//>>> Allowed working time / memory: 100ms / 16MB.



//Tests

//Input
//Stack, Queue
//Insert:Array:0
//Add:Map
//Insert:Set:3
//course start

//Output
//1.Array
//2.Stack
//3.Queue
//4.Set
//5.Map


//Input
//Objects, Generics, Basic syntax
//Swap:Basic syntax:Objects
//Swap:Generics:Objects
//Add:Enum
//Exercise:Wrapper classes
//Exercise:Basic syntax
//course start

//Output
//1.Basic syntax
//2.Basic syntax-Exercise
//3.Objects
//4.Generics
//5.Enum
//6.Wrapper classes
//7.Wrapper classes-Exercise


//Input
//Basic syntax, Arrays, Arrays-Exercise, Methods, Objects, List, List-Exercise, Map
//Swap:List:Map
//Swap:Map:List
//Swap:List:Arrays
//Swap:List:Methods

//Output
//1.Basic syntax
//2.Arrays
//3.Arrays-Exercise
//4.Methods
//5.List
//6.List-Exercise
//7.Objects
//8.Map


//Input
//Linear Data Structures, I/O, Functional Programming, Stream API
//Add:Regular Expressions
//Add:Git
//Add:Linear Data Structures
//Insert:Lists:1
//Insert:Sets and Maps:2
//Add:String Processing
//Swap:String Processing:Git
//Swap:String Processing:Regular Expressions
//Exercise:Stream API
//Add:Stream API
//Exercise:Stream API
//Insert:Stream API:1
//Swap:String Processing:Stacks
//Swap:String Processing:Stream API
//Exercise:I/O
//Swap:Functional Programming:String Processing
//Exercise:I/O
//Swap:I/O:Functional Programming
//Swap:Functional Programming:I/O
//Exercise:Functional Programming
//course start

//Output
//1.Linear Data Structures
//2.Lists
//3.Sets and Maps
//4.I/O
//5.I/O-Exercise
//6.String Processing
//7.Functional Programming
//8.Functional Programming-Exercise
//9.Stream API
//10.Stream API-Exercise
//11.Regular Expressions
//12.Git
//13.Comparator
//14.Comparator-Exercise
