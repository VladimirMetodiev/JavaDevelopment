package basicSyntaxExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class VehiclePark {
    static String[] vehicles;
    static String expression;
    static int counter = 0;

    static void checkStock(char machine, int seats){
        boolean flag = false;

        if(vehicles.length > 0){
            for (int a = 0; a < vehicles.length; a++) {
                if(vehicles[a].charAt(0) == machine && Integer.parseInt(vehicles[a].substring(1)) == seats){
                    System.out.printf("Yes, sold for %d$%n", machine * seats);
                    vehicles[a] = "-1";
                    flag = true;
                    counter++;
                    break;
                }
            }

            if(!flag){
                System.out.println("No");
            }
            else {
                flag = false;
            }
        }
        else {
            System.out.println("No");
        }
    }

    public static void main(String[] arguments) {
        Scanner input = new Scanner(System.in);
        vehicles = input.nextLine().split("\\s+");

        while (!(expression = input.nextLine().toLowerCase()).equals("end of customers!")){
            String[] data = expression.split("\\s+");
            char machine = data[0].charAt(0);
            int seats = Integer.parseInt(data[2]);
            checkStock(machine, seats);
        }

        ArrayList<String> print = new ArrayList<>();

        for (String element : vehicles) {
            if(!element.equals("-1")) {
                print.add(element);
            }
        }

        System.out.println("Vehicles left: " + String.join(", ", print));
        System.out.printf("Vehicles sold: %d", counter);

        input.close();
    }
}



//Condition

//You are manager on a vehicle park. Your Department is to sell cars and give reports to the accounting. You will be given
//all vehicles that are available for selling in format like the example below:

//c2 c4 v10 v20 b50

//Each car is described by vehicle type (single character ‘b’, ‘c’ or ‘v’) and number of seats in the vehicle (natural number).
//For example, “c4” means car with 4 seats, “b50” means bus with 50 seats and “v10” means van with 10 seats.
//Then you need to process a sequence of incoming requests. Each request holds type of vehicle and number of seats
//in the following format:

//Car with 4 seats
//Bus with 20 seats

//If you have vehicle that matches the description of the desired vehicle, you should sell it, otherwise print “No”.
//The price is calculated as а product of the character ASCII code and the number of seats. For example,
//the price for “c4” (car with 4 seats), will be calculated as 99(‘c’) * 4 = 396. If there are 2 or more matching vehicles
//you should sell the leftmost one.
//After you run out of customers, you need to print the vehicles that you didn’t sell and the count of sold vehicles.

//Input
//The input data should be read from the console.
//On the first input line, you will receive all vehicles in the park, separated with single whitespace.
//On the next lines, you will receive requests for vehicles in the following format:
//“{Vehicle Type} with {Number of seats} seats”
//until you receive “End of customers!”
//The input data will always be valid and in the format described. There is no need to check it explicitly.

//Output
//The output should consist of:
//For each vehicle request you either need to print:
//“Yes, sold for {price}$” – if the wanted vehicle is available in the park.
//“No” – if there is no such vehicle in the vehicle park.
//After you stop receiving request, you need to print two lines:
//On the first line, you need to print the remaining vehicles in the format:
//“Vehicles left: x1, x2, x3…”
//On the second line, you need to print the total number of vehicles sold in the following format: “Vehicles sold: x1, x2, x3…”

//Constraints
//The number of vehicles will be in range [0 – 10,000].
//The amount of request for vehicles will be in range [0 – 10,000].
//The number of seats for each vehicle will be in range [1 – 10,000].
//The vehicle type can only be one of the following Car – c; Bus – b; Van – v;
//Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.



//Tests

//Input
//c2 c4 v10 v20 b50
//Car with 4 seats
//Bus with 20 seats
//Bus with 33 seats
//Van with 20 seats
//Bus with 50 seats
//End of customers!

//Output
//Yes, sold for 396$
//No
//No
//Yes, sold for 2360$
//Yes, sold for 4900$
//Vehicles left: c2, v10
//Vehicles sold: 3


//Input
//c2 v8 b20 v5 c4 b50 v8
//Van with 6 seats
//Van with 8 seats
//Bus with 100 seats
//End of customers!

//Output
//No
//Yes, sold for 944$
//No
//Vehicles left: c2, b20, v5, c4, b50, v8
//Vehicles sold: 1


//Input
//c5 c4 c2 v8 v8 b20 v6
//Van with 8 seats
//Van with 8 seats
//Van with 8 seats
//Car with 6 seats
//Car with 2 seats
//Car with 2 seats
//End of customers!

//Output
//Yes, sold for 944$
//Yes, sold for 944$
//No
//No
//Yes, sold for 198$
//No
//Vehicles left: c5, c4, b20, v6
//Vehicles sold: 3


//Input
//c4 c4 c4 c4 c4
//Car with 4 seats
//Car with 4 seats
//Car with 4 seats
//Van with 8 seats
//Car with 4 seats
//Car with 4 seats
//Car with 4 seats
//End of customers!

//Output
//Yes, sold for 396$
//Yes, sold for 396$
//Yes, sold for 396$
//No
//Yes, sold for 396$
//Yes, sold for 396$
//No
//Vehicles left:
//Vehicles sold: 5



//Another solution

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String[] vehicles = input.nextLine().split("\\s+");
//
//        String command, order = "";
//        int seats, cost = 0, counter = 0, printed = 0;
//
//        while(!(command = input.nextLine().toLowerCase()).equals("end of customers!")){
//            if(command.charAt(0) == 'c'){
//                order = "c";
//            }
//            else if(command.charAt(0) == 'v'){
//                order = "v";
//            }
//            else if(command.charAt(0) == 'b'){
//                order = "b";
//            }
//
//            seats = Integer.parseInt(command.substring(9, command.lastIndexOf(' ')));
//            order += seats;
//
//            String result = checkTheVehicleList(vehicles, order);
//            vehicles = soldAVehicle(vehicles, order);
//
//            if(result.equals("yes")){
//                cost = (int)order.charAt(0) * seats;
//                System.out.printf("Yes, sold for %d$%n", cost);
//                counter++;
//            }
//            else if(result.equals("no")){
//                System.out.println("No");
//            }
//        }
//
//        ArrayList<String> availableVehicles = getVehicles(vehicles);
//        System.out.printf("Vehicles left: %s%n", String.join(", ", availableVehicles));
//        System.out.println("Vehicles sold: " + counter);
//    }
//
//
//    static String checkTheVehicleList(String[] vehicles, String order){
//        for (int a = 0; a < vehicles.length; a++) {
//            if(order.equals(vehicles[a])){
//                return "yes";
//            }
//        }
//        return "no";
//    }
//
//
//    static String[] soldAVehicle(String[] vehicles, String order){
//        for (int b = 0; b < vehicles.length; b++) {
//            if(order.equals(vehicles[b])){
//                vehicles[b] = "sold";
//                break;
//            }
//        }
//        return vehicles;
//    }
//
//
//    static ArrayList<String> getVehicles(String[] vehicles){
//        ArrayList<String> result = new ArrayList<>();
//        for (int c = 0; c < vehicles.length; c++) {
//            if(!vehicles[c].equals("sold")){
//                result.add(vehicles[c]);
//            }
//        }
//        return result;
//    }