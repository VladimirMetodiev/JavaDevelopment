package io.serialization.company;

import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    private String name;
    private String surname;
    private String position;

    //static final long serialVersionUID = 2;

    // За да мога да сериализирам един обект, то той трябва да имплементира интерфейс Serializable

    public Employee(int id, String name, String surname, String position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("[%d][%s] %s %s", id, position, name, surname);
    }
}
