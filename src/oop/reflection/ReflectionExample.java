package oop.reflection;

public class ReflectionExample {
    public int id;
    public String name;
    public String workGroup;
    private double value;

    public ReflectionExample() {
    }

    public ReflectionExample(int id, String name, String workGroup) {
        this.id = id;
        this.name = name;
        this.workGroup = workGroup;
    }

    public ReflectionExample(int id, String name, String workGroup, double value) {
        this.id = id;
        this.name = name;
        this.workGroup = workGroup;
        this.setValue(value);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    private void changeWorkGroup(String newWorkGroup) {
        this.workGroup = newWorkGroup;
        System.out.println("The new work-group is: " + newWorkGroup);
    }

    public void increaseValue() {
        this.value *= 2;
    }

    @Override
    public String toString() {
        return "ReflectionExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workGroup='" + workGroup + '\'' +
                ", value=" + value +
                '}';
    }
}
