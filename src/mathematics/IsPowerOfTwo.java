package mathematics;

import java.util.Scanner;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = Integer.parseInt(input.nextLine());
        System.out.println(isPowerOfTwo(value));
    }

    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        return value == 2 || (Math.log10(value) / Math.log10(2)) -  (int)(Math.log10(value) / Math.log10(2)) == 0;
    }
}



//Tests

//0
//false

//1
//true

//-2
//true

//32
//true

//147
//false

//256
//true
