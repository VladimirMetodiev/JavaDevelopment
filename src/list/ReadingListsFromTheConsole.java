package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingListsFromTheConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> integerList = new ArrayList<>();

        int count = Integer.parseInt(input.nextLine());

        for (int a = 0; a < count; a++) {
            integerList.add(input.nextInt());
        }
        input.nextLine();

        System.out.println(integerList);



        List<Double> doubleList = Arrays.stream(input.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());
        System.out.println(doubleList);

        List<String> strList = Arrays.stream(input.nextLine().split(",\\s+")).collect(Collectors.toList());
        System.out.println(strList);
    }
}



//Test

//5
//2 4 6 8 10
//2.3 3.4 4.5 5.6 6.7
//Madagascar, Sri Lanka, Indonesia, Philippines, New Zealand
