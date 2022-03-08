package comparatorExercises.pupils;

import java.util.ArrayList;
import java.util.Scanner;

public class ComparePupils {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = Integer.parseInt(input.nextLine());
        ArrayList<Pupil> pupils = new ArrayList<>();

        for (int a = 0; a < length; a++) {
            String[] data = input.nextLine().split("\\s+");
            pupils.add(new Pupil(data[0], Integer.parseInt(data[1])));
        }

        //pupils.stream().sorted(new PupilComparator()).forEach(e -> System.out.printf("%s %d%n", e.getName(), e.getRating()));
        pupils.stream().sorted(new PupilComparator()).forEach(System.out::println);
    }
}



//Condition

//Създайте клас Pupil, който има 2 полета: име и оценка.
//Програмата получава число N като вход, последвано от N редове с данни във формат: име резултат.
//Необходимо е да се сортирате списъка с ученици в низходящ ред на оценките. В случай, че има равни оценки, учениците
//трябва да бъдат сортирани, във възходящ ред, по име.



//Tests

//Input
//7
//Vladimir 6
//Peter 5
//Alexander 5
//Nina 3
//Vladislav 6
//Sarah 4
//Svetlana 4

//Output
//Vladimir 6
//Vladislav 6
//Alexander 5
//Peter 5
//Sarah 4
//Svetlana 4
//Nina 3


//Input
//5
//Mike 5
//Boris 4
//Simona 3
//Luke 3
//Jason 3

//Output
//Mike 5
//Boris 4
//Jason 3
//Luke 3
//Simona 3


//Input
//4
//Ivan 5
//Anna 5
//Nina 4
//Alex 3

//Output
//Anna 5
//Ivan 5
//Nina 4
//Alex 3


//Input
//6
//Ivan 4
//Ivan 5
//Ivan 3
//Ivan 2
//Alex 2
//Lisa 2

//Output
//Ivan 5
//Ivan 4
//Ivan 3
//Alex 2
//Ivan 2
//Lisa 2
