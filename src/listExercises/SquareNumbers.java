package listExercises;

import java.util.*;
import java.util.stream.Collectors;

public class SquareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        ArrayList<Integer> result = getNumbers(list);

        Collections.sort(result);
        Collections.reverse(result);

        result.forEach(e -> System.out.print(e + " "));
    }

    private static ArrayList<Integer> getNumbers(List<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : list) {
            for(int a = 1; a <= num; a++) {
                if(Math.pow(a, 2) == num) {
                    result.add(num);
                }
                if(Math.pow(a, 2) > num) {
                    break;
                }
            }
        }

        return result;
    }
}



//Condition

//Read a list of integers and extract all square numbers from it and print them in descending order. A square number is an
//integer which is the square of any integer. For example, 1, 4, 9, 16 are square numbers.



//Tests

//3 16 4 5 6 8 9
//16 9 4

//12 1 9 4 16 8 25 49 16
//49 25 16 16 9 4 1

//17 283 39 111 82 6 46
//
