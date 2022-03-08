package oopExercises.companyRoster;

public class AnEmployee extends APerson {
    private double salary;
    private String position;
    private String department;

    public AnEmployee(String name, double salary, String position, String department) {
        super(name);
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.setAge(-1);
        this.setEmail("n/a");
    }

    public AnEmployee(String name, double salary, String position, String department, String email) {
        super(name, email);
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.setAge(-1);
    }

    public AnEmployee(String name, double salary, String position, String department, int age) {
        super(name, age);
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.setEmail("n/a");
    }

    public AnEmployee(String name, double salary, String position, String department, String email, int age) {
        super(name, age, email);
        this.salary = salary;
        this.position = position;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
