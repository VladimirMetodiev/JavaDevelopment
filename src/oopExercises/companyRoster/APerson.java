package oopExercises.companyRoster;

public class APerson {
    private String name;
    private int age;
    private String email;

    public APerson(String name) {
        this.name = name;
    }

    public APerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public APerson(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public APerson(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}