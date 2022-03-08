package algorithmsExercises;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = Integer.parseInt(input.nextLine().trim());

        int[] one = new int[n];
        int[] two = new int[k];

        for (int a = 0; a < n; a++) one[a] = input.nextInt();
        for (int b = 0; b < k; b++) two[b] = input.nextInt();

        for (int e = 0; e < k; e++) {
            int start = 0, end = one.length - 1, middlePoint, index = -1;

            while (start <= end) {
                middlePoint = (start + end) / 2;

                if (one[middlePoint] == two[e]) {
                    index = middlePoint;
                    break;
                }
                else if (one[middlePoint] < two[e]) {
                    start = middlePoint + 1;
                }
                else {
                    end = middlePoint - 1;
                }
            }

            System.out.println(index > -1 ? "YES" : "NO");
        }
    }
}



//Тестове

//10 5
//1 3 6 7 10 12 15 16 17 20
//8 3 16 11 20
//NO
//YES
//YES
//NO
//YES

//3 6
//10 15 20
//30 10 5 20 15 25
//NO
//YES
//NO
//YES
//YES
//NO
