package listExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> source = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int capacity = Integer.parseInt(input.nextLine());

        ArrayList<Wagon> wagons = new ArrayList<>();

        for(int num : source) {
            wagons.add(new Wagon(capacity, num));
        }

        String command;

        while(!(command = input.nextLine()).equals("end")) {
            String[] data = command.split("\\s+");

            switch (data.length) {
                case 1: {
                    for(Wagon w : wagons) {
                        if(w.addPassengers(Integer.parseInt(data[0]))) {
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    wagons.add(new Wagon(capacity, Integer.parseInt(data[1])));
                    break;
                }
                default: break;
            }
        }

        wagons.forEach(w -> System.out.print(w.getCurrentNumber() + " "));
    }
}

class Wagon {
    private int capacity;
    private int currentNumber;

    public Wagon(int capacity, int currentNumber) {
        this.setCapacity(capacity);
        this.setCurrentNumber(currentNumber);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if(capacity < 1) throw new IllegalArgumentException("Wrong capacity.");
        this.capacity = capacity;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        if(currentNumber < 0) throw new IllegalArgumentException("Wrong count.");
        this.currentNumber = currentNumber;
    }

    public boolean addPassengers(int passengers) {
        if(currentNumber + passengers <= capacity) {
            currentNumber += passengers;
            return true;
        }
        else {
            return false;
        }
    }
}



//Condition

//On the first line you will be given a list of wagons (integers). Each integer represents the number of passengers
//that are currently in each wagon. On the next line you will get the max capacity of each wagon (single integer).
//Until you receive "end" you will be given two types of input:
//>>> Add {passengers} – add a wagon to the end with the given number of passengers.
//>>> {passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
//At the end print the final state of the train (all the wagons separated by a space).



//Tests

//32 54 21 12 4 0 23
//75
//Add 10
//Add 0
//30
//10
//75
//end
//72 54 21 12 4 75 23 10 0


//0 0 0 10 2 4
//10
//Add 10
//10
//10
//10
//8
//6
//end
//10 10 10 10 10 10 10
