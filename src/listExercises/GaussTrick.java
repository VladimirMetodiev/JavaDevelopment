package listExercises;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(input.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        numbers = getList(numbers);

        DecimalFormat df = new DecimalFormat("0.######");

        for(Double num : numbers) System.out.print(df.format(num) + " ");
    }

    private static List<Double> getList(List<Double> num) {
        List<Double> result = new ArrayList<>();

        int length = (num.size() % 2 == 0 ? num.size() / 2 : (num.size() / 2) + 1);

        for (int a = 0; a < length; a++) {
            if(length % 2 != 0 && a == length - 1) {
                result.add(num.get(a));
            }
            else {
                result.add(num.get(a) + num.get(num.size() - 1 - a));
            }
        }

        return result;
    }
}



//Tests

//Input
//1 2 3 4
//Output
//5 5


//Input
//1 2 3 4 5
//Output
//6 6 3


//Input
//1.25 2.75 4.25 5.75
//Output
//7 7


//Input
//1.25 2.75 4.25 5.75 7.25
//Output
//8,5 8,5 4,25
