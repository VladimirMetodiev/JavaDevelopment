package oopExercises.animalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) throw new IllegalArgumentException("Name can't be empty.");
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0 || age > 15) throw new IllegalArgumentException("Age should be between 0 and 15.");
        this.age = age;
    }

    private int calculateProductPerMonth() {
        if(age <= 6) {
            return 20;
        }
        else if(age <= 12) {
            return 10;
        }
        else {
            return 0;
        }
    }

    public int getProductPerMonth() {
        return calculateProductPerMonth();
    }

    public String toString() {
        return String.format("Chicken %s (age %d) can produce %d eggs per month.", name, age, calculateProductPerMonth());
    }
}
