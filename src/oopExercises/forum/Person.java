package oopExercises.forum;

public class Person {
    private String name;
    private String surname;
    private Sex sex;
    private int age;

    public Person() {
    }

    public Person(String name, String surname, Sex sex, int age) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
