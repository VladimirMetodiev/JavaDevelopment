package oopExercises.validationOfData;

import java.text.DecimalFormat;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private double salary;

    public Employee (String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0#########");
        return name + " " + surname + " get " + df.format(salary) + " leva";
    }
}
