package oopExercises.salaryIncrease;

import java.text.DecimalFormat;

public class Salary extends Employee {
    private double salary;
    private static int increaseSalary;         // процент на увеличението на заплатата [int - задължително]

    public Salary (String name, String surname, int age, double salary) {
        super(name, surname, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void setIncreaseSalary(int increaseSalary) {
        Salary.increaseSalary = increaseSalary;
    }

    public void increase (){
        double doubleIncrease = Salary.increaseSalary;
        if(super.getAge() < 30) doubleIncrease /= 2.0;
        salary += salary * doubleIncrease / 100.0;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0#########");
        return super.getName() + " " + super.getSurname() + " get " + df.format(salary) + " leva";
    }
}
