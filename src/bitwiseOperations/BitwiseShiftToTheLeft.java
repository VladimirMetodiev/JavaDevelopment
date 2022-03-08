package bitwiseOperations;

public class BitwiseShiftToTheLeft {
    public static void main(String[] args) {
        /*
         * При побитово изместване вляво, най-десните позиции се запълват с нули
         * b = a << n   =>   b = a * 2 ^ n
         */

        int theFirst = 1;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));
        theFirst = theFirst << 1;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));

        System.out.println("------------------------------");

        theFirst = 1;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));
        theFirst = theFirst << 2;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));

        System.out.println("------------------------------");

        theFirst = 1;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));
        theFirst = theFirst << 3;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));

        System.out.println("------------------------------");

        int theSecond = 333;
        System.out.println(theSecond + " => " + Integer.toBinaryString(theSecond));
        theSecond = theSecond << 5;
        System.out.println(theSecond + " => " + Integer.toBinaryString(theSecond));

        System.out.println("------------------------------");

        int theThird = -29;
        System.out.println(theThird + " => " + Integer.toBinaryString(theThird));
        theThird = theThird << 2;
        System.out.println(theThird + " => " + Integer.toBinaryString(theThird));

        System.out.println("------------------------------");

        // Ако задам theFourth << 32 изместването връща същото числото
        // Преди: -10 => 11111111111111111111111111110110
        // След:  -10 => 11111111111111111111111111110110

        // Ако задам theFourth << 30 изместването връща:
        // -1 => 11111111111111111111111111111111
        // -1073741824 => 11000000000000000000000000000000

        int theFourth = -1;
        System.out.println(theFourth + " => " + Integer.toBinaryString(theFourth));
        theFourth = theFourth << 31;
        System.out.println(theFourth + " => " + Integer.toBinaryString(theFourth));

        System.out.println("------------------------------");

        // Ако задам theFourth << 30 изместването връща:
        // 1 => 1
        // 1073741824 => 01000000000000000000000000000000

        // Ако задам theFourth << 31 изместването връща:
        // 1 => 1
        // -2147483648 => 10000000000000000000000000000000

        theFourth = 1;
        System.out.println(theFourth + " => " + Integer.toBinaryString(theFourth));
        theFourth = theFourth << 31;
        System.out.println(theFourth + " => " + Integer.toBinaryString(theFourth));

        System.out.println("------------------------------");
    }
}
