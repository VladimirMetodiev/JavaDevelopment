package mapExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TrickyLinkedHashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedHashMap<Integer, String> stack = new LinkedHashMap<>(8, 0.75F, false);

        String command;
        int counter = 0;
        printMessage();

        while (!(command = input.nextLine()).equals("end")) {
            String[] data = command.split(":");
            try {
                switch(data[0]) {
                    case "push": {
                        if(data.length == 1) throw new Exception("There isn't a person!");
                        ++counter;
                        stack.put(counter, data[1]);
                        break;
                    }
                    case "pop": {
                        if(counter == 0) throw new IllegalArgumentException("The stack is empty!");
                        System.out.printf("[%d] %s%n", counter, stack.get(counter));
                        stack.remove(counter);
                        --counter;
                        break;
                    }
                    case "peek": {
                        if(counter == 0) throw new IllegalArgumentException("The stack is empty!");
                        System.out.printf("[%d] %s%n", counter, stack.get(counter));
                        break;
                    }
                    case "contains": {
                        if(counter == 0) throw new IllegalArgumentException("The stack is empty!");
                        if(data.length == 1) throw new Exception("No one is wanted!");
                        if(stack.containsValue(data[1])) {
                            System.out.println("Yes, it contains.");
                        }
                        else {
                            System.out.println("There isn't such person.");
                        }
                        break;
                    }
                    case "size": {
                        System.out.println("Size: " + stack.size());
                        break;
                    }
                    case "print": {
                        if(counter == 0) throw new IllegalArgumentException("The stack is empty!");
                        for(Map.Entry<Integer, String> entry : stack.entrySet()) {
                            System.out.printf("[%d] %s%n", entry.getKey(), entry.getValue());
                        }
                        break;
                    }
                    default: {
                        System.out.println("Wrong command!");
                    }
                }
            }
            catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            catch (Exception ex) {
                System.out.println("Exception: " + ex.getMessage());
            }
            printMessage();
        }


    }

    private static void printMessage() {
        System.out.println("Choose: \"push\", \"pop\", \"peek\", \"contains\", \"size\", \"print\", \"end\"");
    }
}



//Test

//size
//pop
//peek
//contains:Teodor Petrov
//print
//fly
//push:Anna Dimitrova
//peek
//push:Vladimir Metodiev
//push:Teodor Petrov
//size
//peek
//push:Ivan Petrov
//contains:Teodor Petrov
//contains:Ivo Harizanov
//print
//pop
//contains:Ivan Petrov
//pop
//size
//print
//peek
//contains:
//push
//end

