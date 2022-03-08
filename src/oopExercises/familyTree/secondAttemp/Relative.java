package oopExercises.familyTree.secondAttemp;

import java.util.ArrayList;

public class Relative {
    private Person person;
    private ArrayList<Person> parents;
    private ArrayList<Person> children;

    public Relative(Person person) {
        //if(person.getName() == null || person.getBirthDate() == null) throw new NullPointerException("Data missing!");
        this.setPerson(person);
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<Person> getParents() {
        return parents;
    }

    public void setParents(Person parent) {
        this.parents.add(parent);
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setChildren(Person children) {
        this.children.add(children);
    }

    public void print() {
        System.out.println(this.person);
        System.out.println("Parents:");
        parents.forEach(p -> System.out.println(p));
        System.out.println("Children:");
        children.forEach(c -> System.out.println(c));
    }
}
