package bitwiseOperations;

public class SomeNumbers {
    public static void main(String[] args) {
        int number = 14;

        System.out.println(Integer.toString(number, 2)); // Превръщам number в бинарно число и го принтирам като символен низ
        System.out.println(Integer.toString(number, 8)); // Превръщам number в осмично число и го принтирам като символен низ
        System.out.println(Integer.toString(number, 10)); // Принтирам number като символен низ
        System.out.println(Integer.toString(number, 16).toUpperCase()); // Превръщам number в шеснайсетично число и го принтирам като символен низ

        System.out.println("---------->---------->---------->");

        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toOctalString(number));
        System.out.println(Integer.toHexString(number).toUpperCase());

        System.out.println("---------->---------->---------->");

        long num = 250000L;

        System.out.println(Long.toBinaryString(num));
        System.out.println(Long.toOctalString(num));
        System.out.println(Long.toHexString(num).toUpperCase());

        System.out.println("---------->---------->---------->");

        // Бинарните числа в Java, могат да се изписват с 0b пред тях;

        System.out.println(0b1110);
        System.out.println(0b10011010);
        int someNumber = 0b111101010010011;
        System.out.println(someNumber);

        System.out.println("---------->---------->---------->");

        int maxValue = 0b01111111111111111111111111111111;
        int minValue = 0b10000000000000000000000000000000;
        System.out.println("Maximum value of type int: " + maxValue);
        System.out.println("Minimum value of type int: " + minValue);
    }
}
