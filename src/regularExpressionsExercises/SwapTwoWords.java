package regularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SwapTwoWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pattern pattern = Pattern.compile("([A-Za-z]+\\W*)(\\s)([A-Za-z]+\\W*)");
        System.out.println(pattern.matcher(input.nextLine()).replaceAll("$3 $1"));
    }
}



//Условие

//Даден е символен низ, състоящ се от точно две думи, разделени с интервал. Разменете местата на тези думи. Ако след думите
//има знаци за пунктуация, те трябва да бъдат преместени заедно със съответната дума. Принтирайте резултата.



//Тестове

//Hello, world!
//world! Hello,

//Yellow pears.
//pears. Yellow
