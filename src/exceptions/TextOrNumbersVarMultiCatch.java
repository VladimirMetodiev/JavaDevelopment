package exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class TextOrNumbersVarMultiCatch {
    static String command, text;
    static int[] numbers;
    static int num, index;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Choose: \"text\" or \"integers\"");
            command = input.nextLine().trim().toLowerCase();
            if(command.equals("text") || command.equals("integers")) break;
        }

        switch (command){
            case "text": {
                System.out.println("Enter some message:");
                text = input.nextLine();
                break;
            }
            case "integers": {
                try{
                    System.out.println("How many numbers will you enter?");
                    num = Integer.parseInt(input.nextLine());
                    numbers = new int[num];

                    for (int a = 0; a < num; a++) {
                        System.out.println("Enter an index:");
                        index = Integer.parseInt(input.nextLine());
                        System.out.println("Enter an integer:");
                        numbers[index] = Integer.parseInt(input.nextLine());
                    }
                }
                catch (final NumberFormatException | ArrayIndexOutOfBoundsException ex){
                    ex.printStackTrace();
                    return;
                }
                break;
            }
            default: break;
        }

        if(command.equals("text")) System.out.println(text);
        else System.out.println(Arrays.toString(numbers));
    }
}



//Бележка: За да организирам групово прихващане на грешки, трябва да укажа списъка с изключения в скобите на
//оператора catch, като разделя имената им с побитово ИЛИ. Всеки параметър в груповото прихващане на грешки
//е неявно указан като final (параметрите могат да бъдат и явно указани като final, за целта само пред първият от тях
//се поставя ключовата дума final).

//Tests

//experiment

//3
//0
//998
//1
//999
//2
//1000

//2
//0
//9.9

//4
//0
//text

//10
//30
//1
