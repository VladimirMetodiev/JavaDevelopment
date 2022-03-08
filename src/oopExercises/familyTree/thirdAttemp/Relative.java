package oopExercises.familyTree.thirdAttemp;

import java.util.ArrayList;

public class Relative {
    private Person person;
    private ArrayList<Person> parents;
    private ArrayList<Person> children;

    public Relative() {
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public Relative(Person person) {
        this.person = person;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void addParent(Person person) {
        parents.add(person);
    }

    public void addChild(Person person) {
        children.add(person);
    }

    public void print() {
        System.out.println(this.person);
        System.out.println("Parents:");
        parents.forEach(System.out::println);
        System.out.println("Children:");
        children.forEach(System.out::println);
    }
}
