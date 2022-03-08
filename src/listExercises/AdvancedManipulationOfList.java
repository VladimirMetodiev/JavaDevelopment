package listExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AdvancedManipulationOfList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = Arrays.stream(reader.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command;
        String[] data;

        while(!(command = reader.readLine()).equals("end")) {
            data = command.split("\\s+");

            switch (data[0]) {
                case "Contains": {
                    if(list.contains(Integer.parseInt(data[1]))) System.out.println("Yes");
                    else System.out.println("No such number");
                    break;
                }
                case "Print": {
                    //print(list, data[1]);
                    printVarTwo(list, data[1]);
                    break;
                }
                case "Get": {
                    get(list);
                    break;
                }
                case "Filter": {
                    filter(list, data[1], Integer.parseInt(data[2]));
                    break;
                }
                default: break;
            }
        }

        reader.close();
    }

    private static void print(List<Integer> list, String condition) {
        switch (condition) {
            case "even": {
                for (int a = 0; a < list.size(); a++) {
                    if(list.get(a) % 2 == 0) System.out.print(list.get(a) + " ");
                }
                break;
            }
            case "odd": {
                for (int b = 0; b < list.size(); b++) {
                    if(list.get(b) % 2 != 0) System.out.print(list.get(b) + " ");
                }
                break;
            }
            default: {
                break;
            }
        }
        System.out.println();
    }

    private static void printVarTwo(List<Integer> list, String str) {
        // Да, дойде ми на ум, че мога да използвам Stream API.
        if(str.equals("even")) list.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.print(e + " "));
        else if(str.equals("odd")) list.stream().filter(e -> e % 2 != 0).forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    private static void get(List<Integer> list) {
        int result = list.stream().reduce(0, Integer::sum);
        System.out.println(result);
    }

    private static void filter(List<Integer> list, String condition, int value) {
        switch (condition) {
            case ">": {
                list.stream().filter(e -> e > value).forEach(e -> System.out.print(e + " "));
                break;
            }
            case ">=": {
                list.stream().filter(e -> e >= value).forEach(e -> System.out.print(e + " "));
                break;
            }
            case "<": {
                list.stream().filter(e -> e < value).forEach(e -> System.out.print(e + " "));
                break;
            }
            case "<=": {
                list.stream().filter(e -> e <= value).forEach(e -> System.out.print(e + " "));
                break;
            }
            default: {
                break;
            }
        }
        System.out.println();
    }
}



//Condition

//Now we will implement more complicated list commands. Again, read a list, and until you receive "end" read commands:
//Contains {number} – check if the list contains the number. If yes print "Yes", otherwise print "No such number".
//Print even – print all the numbers that are even separated by a space.
//Print odd – print all the numbers that are odd separated by a space.
//Get sum – print the sum of all the numbers.
//Filter ({condition} {number}) – print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<=".



//Tests

//Input
//2 13 43 876 342 23 543
//Contains 100
//Contains 543
//Print even
//Print odd
//Get sum
//Filter >= 43
//Filter < 100
//end

//Output
//No such number
//Yes
//2 876 342
//13 43 23 543
//1842
//43 876 342 543
//2 13 43 23



//Input
//338 -63 27 -2 -118 62 86 51 16 0 47 -19 34 62 77
//Contains -19
//Contains 51
//Contains 62
//Contains 50
//Print even
//Print odd
//Get sum
//Filter > 0
//Filter >= 19
//Filter < 50
//Filter <= 77
//end

//Output
//Yes
//Yes
//Yes
//No such number
//338 -2 -118 62 86 16 0 34 62
//-63 27 51 47 -19 77
//598
//338 27 62 86 51 16 47 34 62 77
//338 27 62 86 51 47 34 62 77
//-63 27 -2 -118 16 0 47 -19 34
//-63 27 -2 -118 62 51 16 0 47 -19 34 62 77
