package exceptions;

import java.util.Scanner;

public class TextOrNumbers {
    static String command, text;
    static int number;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Choose: \"text\" or \"an integer\"");
            command = input.nextLine().trim().toLowerCase();
            if(command.equals("text") || command.equals("an integer")) break;
        }

        switch (command){
            case "text": {
                System.out.println("Enter some message:");
                text = input.nextLine();
                break;
            }
            case "an integer": {
                System.out.println("Enter an integer:");
                try{
                    number = Integer.parseInt(input.nextLine());
                }
                catch (Exception ex){
                    System.out.println("This isn't an integer.");
                    return;
                }
                break;
            }
            default: break;
        }

        if(command.equals("text")) System.out.println(text);
        else System.out.println(number);
    }
}
