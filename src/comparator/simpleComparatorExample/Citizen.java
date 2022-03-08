package comparator.simpleComparatorExample;

public class Citizen {
    private String name;
    private String surname;
    private int age = 0;

    public Citizen(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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
}
