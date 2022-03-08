package streamAPIExercises;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = Integer.parseInt(input.nextLine());
        long sum = LongStream.generate(() -> Long.parseLong(input.nextLine())).limit(count).sum();
        System.out.println(sum);
    }
}



//Тестове

//3
//9
//5
//1
//15

//5
//16
//93
//-48
//37
//54
//152
