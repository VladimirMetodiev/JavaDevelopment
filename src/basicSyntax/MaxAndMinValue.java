package basicSyntax;

public class MaxAndMinValue {
    public static void main(String[] args) {
        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Float.NaN);                      // not a number (не е число; не може да се представи, като число)
        System.out.println(Float.POSITIVE_INFINITY);
        System.out.println(Float.NEGATIVE_INFINITY);
        System.out.println(Double.NaN);                      // not a number (не е число; не може да се представи, като число)
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);

        boolean isNaN = Double.isNaN(0.0 / 0);
        System.out.println(isNaN);
    }
}
