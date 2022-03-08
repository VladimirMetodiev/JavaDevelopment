package arrayExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KaminoFactory {
    private static int sequenceNumber = -1, index = -1, length = -1, sum = 0, columns;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        columns = Integer.parseInt(input.nextLine());
        String data;

        List<int[]> samples = new ArrayList<>();

        while(!(data = input.nextLine()).equals("Clone them!")) {
            samples.add(Arrays.stream(data.split("[!]+")).mapToInt(Integer::parseInt).toArray());
        }

        for(int a = 0; a < samples.size(); a++) {
            processTheSequence(samples.get(a), a + 1);
        }

        if(sum == 0){
            sequenceNumber = 1;
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", sequenceNumber, sum);

        for (int element : samples.get(sequenceNumber - 1)) {
            System.out.print(element + " ");
        }
    }

    private static void processTheSequence(int[] array, int currentNumber) {
        int currentIndex = -1, currentLength = 0;
        int currentSum = Arrays.stream(array).sum();

        if(array.length == columns) {
            for (int b = 0; b < columns; b++) {
                if(array[b] == 1 && currentIndex == -1) {
                    currentIndex = b;
                    ++currentLength;

                    if(b == columns - 1) {
                        if(checkUp(currentIndex, currentLength, currentSum)) {
                            update(currentNumber, currentIndex, currentLength, currentSum);
                        }
                    }
                }
                else if(array[b] == 1 && currentIndex > -1) {
                    ++currentLength;

                    if(b == columns - 1) {
                        if(checkUp(currentIndex, currentLength, currentSum)) {
                            update(currentNumber, currentIndex, currentLength, currentSum);
                        }
                    }
                }
                else {
                    if(currentIndex > -1) {
                        if(checkUp(currentIndex, currentLength, currentSum)) {
                            update(currentNumber, currentIndex, currentLength, currentSum);
                        }
                        currentIndex = -1;
                        currentLength = 0;
                    }
                }
            }
        }
    }

    private static boolean checkUp(int currentIndex, int currentLength, int currentSum) {
        if(currentLength > length) {
            return true;
        }
        else if(currentLength == length) {
            if(currentIndex < index) {
                return true;
            }
            else if(currentIndex == index) {
                if(currentSum > sum) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void update(int currentNumber, int currentIndex, int currentLength, int currentSum) {
        sequenceNumber = currentNumber;
        index = currentIndex;
        length = currentLength;
        sum = currentSum;
    }
}



//Condition

//The clone factory in Kamino got another order to clone troops. But this time you are tasked to find the best DNA sequence
//to use in the production.
//You will receive the DNA length and until you receive the command "Clone them!" you will be receiving a DNA sequences of ones and zeroes,
//split by "!" (one or several).
//You should select the sequence with the longest subsequence of ones. If there are several sequences with same length of subsequence of ones,
//print the one with the leftmost starting index, if there are several sequences with same length and starting index, select the sequence
//with the greater sum of its elements.
//After you receive the last command "Clone them!" you should print the collected information in the following format:
//"Best DNA sample {bestSequenceIndex} with sum: {bestSequenceSum}."
//"{DNA sequence, joined by space}"

//Input / Constraints
//The first line holds the length of the sequences – integer in range [1…100];
//On the next lines until you receive "Clone them!" you will be receiving sequences (at least one) of ones and zeroes, split by "!" (one or several).

//Output
//The output should be printed on the console and consists of two lines in the following format:
//"Best DNA sample {bestSequenceIndex} with sum: {bestSequenceSum}."
//"{DNA sequence, joined by space}"



//Tests

//Input
//3
//0!0!0
//Clone them!
//Output
//Best DNA sample 1 with sum: 0.
//0 0 0

//Input
//5
//1!0!1!1!0
//0!1!1!0!0
//Clone them!
//Output
//Best DNA sample 2 with sum: 2.
//0 1 1 0 0

//Input
//4
//1!1!0!1
//1!0!0!1
//1!1!0!0
//Clone them!
//Output
//Best DNA sample 1 with sum: 3.
//1 1 0 1

//Input
//6
//1!0!0!1!1!0
//1!1!0!0!1!1
//0!1!0!1!1!0
//Clone them!
//Output
//Best DNA sample 2 with sum: 4.
//1 1 0 0 1 1

//Input
//5
//1!0!1!0!1
//0!1!0!1!0
//Clone them!
//Output
//Best DNA sample 1 with sum: 3.
//1 0 1 0 1



//My old solution 100/100

//public class KaminoFactory {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int length = Integer.parseInt(input.nextLine());
//
//        int[] current = new int[length];
//        int[] theBest = new int[length];
//
//        int currentStart = -1, currentLength = 0, currentCountOfOnes = 0;
//        int theBestStart = -1, theBestLength = 0, theBestCountOfOnes = 0, sequence = 0;
//        String expression = "";
//        boolean flag;
//        int counter = 0;
//
//        while(true){
//            expression = input.nextLine();
//            if(expression.equals("Clone them!")){
//                break;
//            }
//
//            current = Arrays.stream(expression.split("!+")).mapToInt(Integer::parseInt).toArray();
//
//            counter++;
//            currentCountOfOnes = countOnes(current);
//
//            for (int a = 0; a < length; a++) {
//                if(current[a] == 1 && a == length - 1){
//                    if(currentStart == - 1){
//                        currentStart = a;
//                        currentLength++;
//                    }
//                    else{
//                        currentLength++;
//                    }
//
//                    flag = check(currentStart, currentLength, currentCountOfOnes, theBestStart, theBestLength, theBestCountOfOnes);
//
//                    if(flag){
//                        theBest = equalTo(theBest, current);
//                        theBestStart = currentStart;
//                        theBestLength = currentLength;
//                        theBestCountOfOnes = currentCountOfOnes;
//                        sequence = counter;
//                    }
//
//                    currentStart = -1;
//                    currentLength = 0;
//                }
//                else if(current[a] == 1 && currentStart == -1){
//                    currentStart = a;
//                    currentLength++;
//                }
//                else if(current[a] == 1 && currentStart > -1){
//                    currentLength++;
//                }
//                else{
//                    flag = check(currentStart, currentLength, currentCountOfOnes, theBestStart, theBestLength, theBestCountOfOnes);
//
//                    if(flag){
//                        theBest = equalTo(theBest, current);
//                        theBestStart = currentStart;
//                        theBestLength = currentLength;
//                        theBestCountOfOnes = currentCountOfOnes;
//                        sequence = counter;
//                    }
//
//                    currentStart = -1;
//                    currentLength = 0;
//                }
//            }
//        }
//
//        if(theBestCountOfOnes == 0){
//            sequence = 1;
//        }
//
//        System.out.printf("Best DNA sample %d with sum: %d.%n", sequence, theBestCountOfOnes);
//        for(int el : theBest){
//            System.out.print(el + " ");
//        }
//    }
//
//    private static int countOnes(int[] c){
//        int counter = 0;
//        for(int el : c){
//            if(el == 1) counter++;
//        }
//        return counter;
//    }
//
//    private static boolean check(int currentStart, int currentLength, int currentCountOfOnes, int theBestStart, int theBestLength, int theBestCountOfOnes){
//        boolean flag = false;
//
//        if(currentLength > theBestLength){
//            flag = true;
//        }
//        else if(currentLength == theBestLength){
//            if(currentStart < theBestStart){
//                flag = true;
//            }
//            else{
//                if(currentCountOfOnes > theBestCountOfOnes){
//                    flag = true;
//                }
//            }
//        }
//
//        return flag;
//    }
//
//    private static int[] equalTo(int[] theBest, int[] current){
//        for (int i = 0; i < theBest.length; i++) {
//            theBest[i] = current[i];
//        }
//        return theBest;
//    }
//}



