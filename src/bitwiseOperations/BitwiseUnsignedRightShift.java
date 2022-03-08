package bitwiseOperations;

public class BitwiseUnsignedRightShift {
    public static void main(String[] args) {
        /*
         * При побитово изместване вдясно без знак, битовете се изместват вдясно, отляво се добавят нули, а най-десните битове се губят
         */

        int theFirst = 1073741824;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));
        theFirst = theFirst >>> 1;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));

        System.out.println("------------------------------");

        theFirst = 1073741824;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));
        theFirst = theFirst >>> 2;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));

        System.out.println("------------------------------");

        theFirst = -1;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));
        theFirst = theFirst >>> 1;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));

        System.out.println("------------------------------");

        theFirst = -1;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));
        theFirst = theFirst >>> 2;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));

        System.out.println("------------------------------");

        theFirst = 725437749;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));
        theFirst = theFirst >>> 3;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));

        System.out.println("------------------------------");

        theFirst = -679294388;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));
        theFirst = theFirst >>> 3;
        System.out.println(theFirst + " => " + Integer.toBinaryString(theFirst));

        System.out.println("------------------------------");
    }
}
