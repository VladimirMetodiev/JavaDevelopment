package bitwiseOperations;

public class BitwiseShiftToTheRight {
    public static void main(String[] args) {
        /*
         * При побитово изместване вдясно, най-десните позиции се губят, а отляво се добавят 1-ци или 0-ли в зависимост от знака
         * b = a >> n   =>   b = a / 2 ^ n
         */

        int theFirst = 1000;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));
        theFirst = theFirst >> 1;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));

        System.out.println("------------------------------");

        theFirst = 1000;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));
        theFirst = theFirst >> 2;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));

        System.out.println("------------------------------");

        theFirst = 1000;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));
        theFirst = theFirst >> 3;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));

        System.out.println("------------------------------");

        theFirst = 1000;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));
        theFirst = theFirst >> 4;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));

        System.out.println("------------------------------");

        int theSecond = 1073741824;
        System.out.println(theSecond + " => " + Integer.toBinaryString(theSecond));
        theSecond = theSecond >> 5;
        System.out.println(theSecond + " => " + Integer.toBinaryString(theSecond));

        System.out.println("------------------------------");

        int theThird = -111;
        System.out.println(theThird + " => " + Integer.toBinaryString(theThird));
        theThird = theThird >> 3;
        System.out.println(theThird + " => " + Integer.toBinaryString(theThird));

        System.out.println("------------------------------");
    }
}
