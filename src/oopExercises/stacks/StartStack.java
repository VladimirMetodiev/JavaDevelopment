package oopExercises.stacks;

import java.util.Scanner;

public class StartStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack myStack = new MyStack();
        String expression;
        String[] data;

        while(!(expression = input.nextLine().toLowerCase()).equals("end")){
            data = expression.split("\\s+");

            try {
                switch (data[0]) {
                    case "push":
                        myStack.push(Integer.parseInt(data[1]));
                        break;
                    case "pop":
                        if(myStack.size() - 1 >= 0) {
                            System.out.println(myStack.pop());
                        }
                        break;
                    case "max":
                        System.out.println(myStack.getMax());
                        break;
                    case "min":
                        System.out.println(myStack.getMin());
                        break;
                    case "size":
                        System.out.println(myStack.size());
                        break;
                    case "empty":
                        System.out.println(myStack.isEmpty());
                        break;
                    case "print":
                        myStack.print();
                        break;
                    default:
                        System.out.println("Wrong command!");
                        break;
                }
            }
            catch (ArrayIndexOutOfBoundsException ex1){
                System.out.println("Missed number.");
            }
            catch (NumberFormatException ex2){
                System.out.println("Wrong argument.");
            }
        }

        input.close();
    }
}



//Test

//empty
//size
//pop
//push 8
//push 19
//push -63
//push 0
//empty
//size
//push  74
//push 109
//push -103
//push 56
//push 56
//push -6
//push 98
//min
//max
//pop
//push 110
//push -110
//min
//max
//pop
//min
//print
//end
