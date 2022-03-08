package oop.nestedClasses.localInnerClass;

public class Main {
    public static void main(String[] args) {
        ThirdOuterClass obj = new ThirdOuterClass(); // Създавам инстанция на външният клас
        obj.getResult(); // Извиквам метода на външният клас, в който се намира локалният клас
    }
}
