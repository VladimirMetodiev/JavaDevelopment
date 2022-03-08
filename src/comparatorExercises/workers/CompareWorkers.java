package comparatorExercises.workers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CompareWorkers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = Integer.parseInt(input.nextLine());
        ArrayList<Worker> workers = new ArrayList<>();

        for (int a = 0; a < length; a++) {
            String[] data = input.nextLine().split("\\s+");
            workers.add(new Worker(data[0], Integer.parseInt(data[1])));
        }

        // За да подредя работниците по низходящ ред на трудовият им стаж, пред w слагам "-" (минус)
        workers.stream()
                .sorted(Comparator.comparing((Worker w) -> -w.getService()).thenComparing(p -> p.getName()))
                .forEach(System.out::println);
    }
}



//Test

//10
//Nina 9
//Emil 2
//Ivan 7
//Alexandra 6
//Konstantin 11
//Georgy 4
//Lora 5
//Valentina 8
//Diana 3
//Nicola 8


//Konstantin 11
//Nina 9
//Nicola 8
//Valentina 8
//Ivan 7
//Alexandra 6
//Lora 5
//Georgy 4
//Diana 3
//Emil 2
