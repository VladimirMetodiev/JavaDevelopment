package oop.staff;

import oop.people.Person;

public class Employee extends Person {
    private String id = null;
    private String position = null;
    private double salary = 0d;

    protected Employee(){ }

    protected Employee(String name, String surname, int age){
        super(name, surname, age);
    }

    protected Employee(String name, String surname, int age, String id){
        super(name, surname, age);
        this.id = id;
    }

    protected Employee(String name, String surname, int age, String id, String position){
        this(name, surname, age, id);
        this.position = position;
    }

    protected Employee(String name, String surname, int age, String id, String position, double salary){
        super(name, surname, age);
        this.id = id;
        this.position = position;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("[%s][%s] %s %s: $ %.2f", getId(), getPosition(), getName(), getSurname(), getSalary());
    }
}
