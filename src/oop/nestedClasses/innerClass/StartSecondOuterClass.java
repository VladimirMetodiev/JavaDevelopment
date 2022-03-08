package oop.nestedClasses.innerClass;

public class StartSecondOuterClass {
    public static void main(String[] args) {
        SecondOuterClass obj1 = new SecondOuterClass("blue", 2, 460);
        System.out.println(obj1 + "\n");



        SecondOuterClass obj2 = new SecondOuterClass("green", 5);
        SecondOuterClass.Engine engine = obj2.new Engine(180);
        obj2.setEngine(engine);

        System.out.println(obj2.engine);
        System.out.println(obj2);
    }
}
