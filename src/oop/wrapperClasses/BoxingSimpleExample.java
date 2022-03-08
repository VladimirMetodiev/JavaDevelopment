package oop.wrapperClasses;

public class BoxingSimpleExample {
    public static void main(String[] args) {
        int primitive = 10;

        Integer reference = Integer.valueOf(primitive);

        System.out.println(reference);

        int backToPrimitive = reference.intValue();

        System.out.println(backToPrimitive);
    }
}
