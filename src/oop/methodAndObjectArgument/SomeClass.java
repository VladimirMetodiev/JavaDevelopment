package oop.methodAndObjectArgument;

public class SomeClass {
    public static void main(String[] args) {
        AuxiliaryClass aux = new AuxiliaryClass();
        increase(aux);
        System.out.println(aux.getField());
        increase(aux);
        System.out.println(aux.getField());
        increase(aux);
        System.out.println(aux.getField());
    }

    private static void increase(AuxiliaryClass obj) {
        obj.setField(obj.getField() + 1);
    }
}

class AuxiliaryClass {
    private int field = 0;

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }
}