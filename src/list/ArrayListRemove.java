package list;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(1);
        myArray.add(8);
        myArray.add(2);
        myArray.add(1);
        myArray.add(3);
        myArray.add(2);
        myArray.add(1);
        myArray.add(11);
        myArray.add(9);
        myArray.add(1);
        System.out.println(myArray);

        myArray.remove(1); // Премахва интиджър по индекс
        System.out.println(myArray);

        myArray.remove((Integer) 1); // За да премахна интиджър по стойност, задължително трябва да преобразувам стойността
        System.out.println(myArray);

        System.out.println("------------------------------");

        ArrayList<Creature> fairyTaleList = new ArrayList<>();

        Creature cr1 = new Creature("Am-Gul", 560);
        fairyTaleList.add(cr1);
        Creature cr2 = new Creature("Goblin", 34);
        fairyTaleList.add(cr2);
        Creature cr3 = new Creature("Baba Yaga", 355);
        fairyTaleList.add(cr3);
        Creature cr4 = new Creature("Phoenix", 150486);
        fairyTaleList.add(cr4);
        Creature cr5 = new Creature("Phoenix", 150486);
        fairyTaleList.add(cr5);
        Creature cr6 = new Creature("Pinocchio", 6);
        fairyTaleList.add(cr6);
        Creature cr7 = new Creature("Thorin Oakenshield", 53);
        fairyTaleList.add(cr7);

        for (Creature c : fairyTaleList) System.out.println(c);

        System.out.println("------------------------------");

        System.out.println(cr4.equals(cr5)); // Сравнението, за да върне true, трябва да преопределя метода .equals()

        System.out.println("------------------------------");

        fairyTaleList.remove(cr1);
        fairyTaleList.remove(4);
        fairyTaleList.remove(cr5);

        for (Creature c : fairyTaleList) System.out.println(c);
    }
}

class Creature {
    private String name;
    private int age;

    Creature(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.matches("[A-Z][A-Za-z-\\s]{2,30}")) throw new IllegalArgumentException("This isn't a name.");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) throw new IllegalArgumentException("This isn't age.");
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creature creature = (Creature) o;
        return age == creature.age && Objects.equals(name, creature.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return String.format("%s - %d", name, age);
    }
}