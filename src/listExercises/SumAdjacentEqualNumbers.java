package listExercises;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(input.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        int length = numbers.size();

        for (int a = 1; a < length; a++) {
            if(numbers.get(a - 1).equals(numbers.get(a))) {
                numbers.set(a - 1, 2 * numbers.get(a - 1));
                numbers.remove(a);
                a = 0;
                length = numbers.size();
            }
        }

        DecimalFormat df = new DecimalFormat("0.##########");

        for(Double d : numbers) {
            System.out.print(df.format(d) + " ");
        }
    }
}



//Tests

//Input
//3 3 6 1
//Output
//12 1


//Input
//8 2 2 4 8 16
//Output
//16 8 16


//Input
//5 4 2 1 1 4
//Output
//5 8 4


//Input
//0.1 0.1 5 -5
//Output
//0,2 5 -5


//Input
//1.25 1.25 2.5 5 10
//Output
//20
