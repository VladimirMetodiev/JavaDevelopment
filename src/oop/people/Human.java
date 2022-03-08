package oop.people;

public class Human {
    String name = "No Name";
    int age = 1;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(int age) {
        this.age = age;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
