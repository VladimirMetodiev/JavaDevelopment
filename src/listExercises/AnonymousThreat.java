package listExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> cipher = Arrays.stream(input.nextLine().split("\\s+")).collect(Collectors.toList());

        String command;

        while(!(command = input.nextLine()).equals("3:1")) {
            String[] data = command.split("\\s+");

            switch (data[0]) {
                case "merge": {
                    cipher = merge(cipher, Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                    break;
                }
                case "divide": {
                    cipher = divide(cipher, Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                    break;
                }
                default: break;
            }
        }

        System.out.println(String.join(" ", cipher));
    }

    private static List<String> merge(List<String> list, int startIndex, int endIndex) {
        StringBuilder sb = new StringBuilder();
        startIndex = startIndex >= 0 ? startIndex : 0;
        endIndex = endIndex < list.size() ? endIndex : list.size() - 1;

        for (int a = startIndex; a <= endIndex; a++) {
            sb.append(list.get(startIndex));
            list.remove(startIndex);
        }

        if(startIndex > list.size() - 1) {
            list.add(sb.toString());
        }
        else {
            list.add(startIndex, sb.toString());
        }

        return list;
    }


    // index винаги трябва да бъде в рамките на елементите на масива
    // partitions трябва да бъде в диапазона [0, 100]

    // Ако низът НЕ МОЖЕ да бъде разделен точно на дадените дялове:
    // да направя всички дялове с изключение на ПОСЛЕДНИЯ с равна дължина;
    // да направя ПОСЛЕДНИЯТ ДЯЛ – НАЙ-ДЪЛЪГ;

    private static List<String> divide(List<String> list, int index, int partitions) {
        if(partitions < 1) {
            return list;
        }
        else {
            index = index >= 0 ? (index > list.size() - 1 ? list.size() - 1 : index) : 0;
            String str = list.get(index);
            ArrayList<String> current = new ArrayList<>();

            if(str.length() % partitions == 0) {
                int part = str.length() / partitions;
                for (int a = 0; a < str.length(); a += part) {
                    current.add(str.substring(a, a + part));
                }
            }
            else {
                if(((double)str.length() / partitions) < 1) {
                    for (int a = 0; a < str.length() - 2; a++) {
                        current.add("" + str.charAt(a));
                    }
                    current.add(str.substring(str.length() - 2));
                }
                else {
                    int part = str.length() / partitions;
                    int remainder = str.length() - part * partitions + part;

                    int start = 0;
                    int end = part;

                    for (int e = 0; e < partitions - 1; e++) {
                        current.add(str.substring(start, end));
                        start += part;
                        end += part;
                    }

                    current.add(str.substring(str.length() - remainder));
                }
            }

            list.addAll(index, current);
            list.remove(index + current.size());
            return list;
        }
    }
}



//Condition

//The Anonymous have created a cyber hypervirus which steals data from the CIA. You, as the lead security developer in CIA,
//have been tasked to analyze the software of the virus and observe its actions on the data. The virus is known for his innovative
//and unbelievably clever technique of merging and dividing data into partitions.
//You will receive a single input line containing STRINGS separated by spaces.
//The strings may contain any ASCII character except whitespace.
//You will then begin receiving commands in one of the following formats:
//>>> merge {startIndex} {endIndex}
//>>> divide {index} {partitions}
//Every time you receive the merge command, you must merge all elements from the startIndex, till the endIndex. In other words,
//you should concatenate them.
//Example: {abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}
//If any of the given indexes is out of the array, you must take ONLY the range that is INSIDE the array and merge it.
//Every time you receive the divide command, you must DIVIDE the element at the given index, into several small substrings with equal length.
//The count of the substrings should be equal to the given partitions.
//Example: {abcdef, ghi, jkl} -> divide 0 3 -> {ab, cd, ef, ghi, jkl}
//If the string CANNOT be exactly divided into the given partitions, make all partitions except the LAST with EQUAL LENGTHS,
//and make the LAST one – the LONGEST.
//Example: {abcd, efgh, ijkl} -> divide 0 3 -> {a, b, cd, efgh, ijkl}
//The input ends when you receive the command “3:1”. At that point you must print the resulting elements, joined by a space.
//
//Input
//>>> The first input line will contain the array of data.
//>>> On the next several input lines you will receive commands in the format specified above.
//>>> The input ends when you receive the command “3:1”.
//Output
//>>> As output you must print a single line containing the elements of the array, joined by a space.
//Constrains
//>>> The strings in the array may contain any ASCII character except whitespace.
//>>> The startIndex and the endIndex will be in range [-1000, 1000].
//>>> The endIndex will ALWAYS be GREATER than the startIndex.
//>>> The index in the divide command will ALWAYS be INSIDE the array.
//>>> The partitions will be in range [0, 100].
//>>> Allowed working time/memory: 100ms / 16MB.



//Tests

//Input
//22 456 2558694715
//divide 2 1
//3:1

//Output
//22 456 2558694715



//Input
//22 456 2558694715
//divide 2 11
//3:1

//Output
//22 456 2 5 5 8 6 9 4 7 15



//Input
//22 456 2558694715
//divide 2 4
//3:1

//Output
//22 456 25 58 69 4715



//Input
//22 456 25586947158
//divide 2 4
//3:1

//Output
//22 456 25 58 69 47158



//Input
//22 456 2558694715
//divide 2 6
//3:1

//Output
//22 456 2 5 5 8 6 94715



//Input
//22 456 25586947158
//divide 2 6
//3:1

//Output
//22 456 2 5 5 8 6 947158



//Input
//259437 453624856711 11
//divide 0 3
//merge -5 1
//divide 2 6
//merge 1 2
//merge 2 10
//divide 2 3
//3:1

//Output
//2594 3745 3624 8567 1111



//Input
//ant ic ipa ti on
//merge 0 3
//merge 3 4
//merge 0 3
//3:1

//Output
//anticipation



//Input
//T hereisa foxinthehen -ho use.
//divide 1 3
//divide 3 3
//divide 6 2
//divide 6 2
//divide 7 2
//merge 0   2
//merge 1 2
//merge 3 4
//divide 5 2
//merge  6  15
//3:1

//Output
//There is a fox in the hen-house.
