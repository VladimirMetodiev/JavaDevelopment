package functionalProgrammingExercises;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] data = input.nextLine().split("\\s+");

        Consumer<String[]> print = (arr) -> {
            for(String e : arr) System.out.println(e);
        };

        print.accept(data);
    }
}



//Test

//Anna Vladimir Konstantin Ema David
