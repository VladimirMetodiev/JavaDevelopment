package oop.nestedClasses.staticClass;

public class StartFirstOuterClass {
    public static void main(String[] args) {
        FirstOuterClass.Engine engine = new FirstOuterClass.Engine(256);
        System.out.println(engine);
        System.out.println(engine.horsePower);

        FirstOuterClass theFirst = new FirstOuterClass("black", 4, engine);
        System.out.println(theFirst);
        theFirst.show();
    }
}
